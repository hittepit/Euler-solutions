package euler.problem43
import euler.problems.Solution
import euler.utils.Math._

object Euler43 {
	def main(args: Array[String]) {
		println(new Euler43().execute)
	}
}
/**
 * Not very fast
 */
class Euler43 extends Solution {
  val properties = Map(2->2,3->3,4->5,5->7,6->11,7->13,8->17)
  
  def execute = (0L/:permute(List(0,1,2,3,4,5,6,7,8,9))){(sum:Long,candidate:List[Int]) =>
		  	sum + (if(fillProperty(candidate)) (0L/:candidate)(_*10+_) else 0) 
		  }.toString
  
  def fillProperty(candidate:List[Int]):Boolean = ! properties.exists{(element:(Int,Int)) =>
	  val start = element._1-1
	  val n = candidate(start)*100+candidate(start+1)*10+candidate(start+2)
	  n%element._2!=0
	}

}