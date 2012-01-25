package euler.problem1

object Euler1 {
	def main(args: Array[String]) {
		val maximum = 1000
		var total = 0
		(1 to maximum-1).foreach{(x:Int) =>
		  if(x%3==0 || x%5==0) total+=x
		}
		
		println(total)
	}
}