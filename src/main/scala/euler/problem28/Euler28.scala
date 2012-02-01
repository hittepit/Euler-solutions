package euler.problem28

import scala.collection.mutable._

object Euler28 {
	def main(args: Array[String]) {
		val d1 = ListBuffer(1)
		val d2 = ListBuffer(1)
		val d3 = ListBuffer(1)
		val d4 = ListBuffer(1)
		
		var inc=2
		
		(1 to 500).foreach{(x:Int) =>
		  d1+=(d1.last+inc)
		  inc+=2
		  d2+=(d2.last+inc)
		  inc+=2
		  d3+=(d3.last+inc)
		  inc+=2
		  d4+=(d4.last+inc)
		  inc+=2
		}
		
		val somme = (0/:d1)(_+_)+(0/:d2)(_+_)+(0/:d3)(_+_)+(0/:d4)(_+_)-3 //-3 because central element was counted 4 times
		println(somme)
	}
}