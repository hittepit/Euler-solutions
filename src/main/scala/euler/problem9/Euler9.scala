package euler.problem9
import euler.problems.Solution

object Euler9 {
	def main(args: Array[String]) {
		for(c <- 1000 to 1 by -1){
			val c2 = c*c
			val rest = 1000 - c
			for(b <- rest-1 to 1+rest/2 by-1){
				val a = rest-b
				if(a*a + b*b == c2){
					println("Solution: a="+a+", b="+b+", c="+c+"=>"+a*b*c)
                }
			}
         }
    }
}

class Euler9 extends Solution {
  def execute = {
    var solution = ""
	for(c <- 1000 to 1 by -1){
		val c2 = c*c
		val rest = 1000 - c
		for(b <- rest-1 to 1+rest/2 by-1){
			val a = rest-b
			if(a*a + b*b == c2){
				solution = (a*b*c).toString
            }
		}
     }
    solution
  }
}
