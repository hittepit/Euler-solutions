package euler.problems

import scala.swing._
import scala.swing.event._

import euler.utils.Files._

object Euler extends SimpleSwingApplication {
	def top = new MainFrame{
	  val problems = read("euler/problems/solutions.txt")
	  title="Euler solutions"
	  val mainPanel = new BoxPanel(Orientation.Vertical)
	  val problemSelector = new ComboBox(problems)
	  
	  val executeButton = new Button{text="Execute"}
	  val resultLabel = new Label{text="  "}
	  
	  mainPanel.contents + new Label{text="Chosse a problem"}
	  mainPanel.contents + problemSelector
	  mainPanel.contents + executeButton
	  mainPanel.contents + resultLabel
	  
	  contents = mainPanel
	  
	  listenTo(executeButton)
	  
	  reactions += {
	    case ButtonClicked(b) => b.enabled = false 
	      					val sel = problemSelector.selection.item
	    					val problemC = Class.forName("euler.problem"+sel+".Euler"+sel)
	    					val problem = problemC.newInstance().asInstanceOf[{def execute():String}]
	    					val result = problem.execute()
	    					resultLabel.text = result
	    					b.enabled = true
	  }
	}
}

case class ComboItem(val value:String, val resolver:Class[_])