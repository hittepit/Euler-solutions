package euler.problem32

import scala.collection.mutable._

object Euler32 {
	def main(args: Array[String]) {
	  val products = Set[Long]()
	  
	  var x = 1000L
	  while(x<999999L){
	  	divisors(x).foreach{(d:Long) =>
	  	  val s = x.toString()+d.toString()+(x/d).toString()
	  	  if(isPandigital(s)) products+=x
	  	}
	  	x+=1
	  }
	  
	  println(products)
	  println("Solutions = "+(0L/:products)(_+_))
	}
	
	def divisors(n:Long) = {
	  val ds = Set[Long]()
	  (1L to Math.sqrt(n).toLong).foreach {(d:Long) =>
	    if(n%d == 0) ds+=d
	  }
	  ds
	}
	
	def isPandigital(s:String) = s.length()==9 && (s.toSet-'0').size==9
}