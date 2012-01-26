package euler.problem18
import java.io.File
import java.io.FileReader
import java.io.BufferedReader
import java.io.InputStreamReader
import euler.utils.Timer

object Euler18 extends Timer{
	def main(args: Array[String]) {
		val f = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("euler/problem18/numbers.txt")))
		var ligne =""
		var data=List[String]()
		do{
		  ligne = f.readLine()
		  if(ligne != null) data=data:::List(ligne)
		}while(ligne!=null)

		println(solve(data))
	}
	
	def reduce(lastComputedLine:List[Int],tree:List[String]):List[Int] = lastComputedLine match {
	  case List() => val li = List.fromArray(tree(tree.size-1).split(" ").map(_.toInt))
	  				reduce(li,tree)
	  case List(n) => List(n)
	  case l:List[Int] => val newLine = List.fromArray(tree(l.size-2).split(" ").map(_.toInt))
	  						var verNewLine = List[Int]()
	  						(0 to newLine.size-1).foreach((index:Int)=>
	  						  		verNewLine= verNewLine:::List(newLine(index) + Math.max(l(index),l(index+1)))
	  						 )
	  						 reduce(verNewLine,tree)
	}
	
	def solve(triangle:List[String]) = time("solution"){() => reduce(List[Int](),triangle)(0)}
}
