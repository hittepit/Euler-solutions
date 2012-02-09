package euler.problem6
import euler.utils.Timer

object Euler6 extends Timer{
	def main(args: Array[String]) {
	  println(solve(100))
	}
	
	def solve(max:Int) = time("solution"){() =>
		val r = 1 to max
		
		val squaresum = {
		  val a=(0/:r)(_+_)
		  a*a
		}
		
		val sumsquare = (0/:r)((a:Int,b:Int)=>a+b*b)
		
		Math.abs(sumsquare-squaresum)
	}
}

class Euler6 {
	def execute = solve(100).toString
	
	def solve(max:Int) = {
		val r = 1 to max
		
		val squaresum = {
		  val a=(0/:r)(_+_)
		  a*a
		}
		
		val sumsquare = (0/:r)((a:Int,b:Int)=>a+b*b)
		
		Math.abs(sumsquare-squaresum)
	}
}