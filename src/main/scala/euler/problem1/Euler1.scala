package euler.problem1
import euler.utils.Timer

object Euler1 extends Timer{
	def main(args: Array[String]) {
		val maximum = 1000
		val result1 = solution1(maximum)
		val result2 = solution2(maximum)
		
		println(result1)
		println(result2)
	}
	
	def solution1(max:Int) = time("solution1") {() =>
		var total = 0
		(1 to max-1).foreach{(x:Int) =>
		  if(x%3==0 || x%5==0) total+=x
		}
		total
	}
	
	def solution2(max:Int) = time("solution2") { () =>
	  (0/:(1 to max-1))((x:Int,y:Int) => if(y%3==0 || y%5==0) x+y else x)
	}
}

class Euler1 {
	val maximum = 1000
	
	def execute = solution(maximum).toString
	
	def solution(max:Int) = (0/:(1 to max-1))((x:Int,y:Int) => if(y%3==0 || y%5==0) x+y else x)
	
}
