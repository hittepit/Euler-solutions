package euler.problem29

import scala.collection.mutable._

object Euler29 {
	def main(args: Array[String]) {
		val max = 100
		val pow = Set[BigInt]()
		
		var count = 0
		
		for(a <- BigInt(2) to BigInt(max);b <- 2 to max) pow+=a.pow(b)
		 
		println(pow.size)
	}
}