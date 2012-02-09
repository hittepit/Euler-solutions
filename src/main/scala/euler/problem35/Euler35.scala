package euler.problem35

import euler.utils.Math._
import scala.collection._

object Euler35 {
	def main(args: Array[String]) {
		val max = 1000000
		
		val circularPrimes = (Set[Int]()/:(2 to max))((primes:Set[Int],candidate) =>
			if((true /: rotations(candidate.toString()))((isP:Boolean,s:String)=>isP && isPrime(s.toLong)))
			  primes+candidate
			  else
			    primes
		  )
		  
		  println(circularPrimes.size)
	}
	
	def rotations(s:String):mutable.Set[String] ={
	  val rot = mutable.Set[String]()
	  (0 to s.length()).foreach{(index:Int) =>
	    rot+=s.drop(s.length-index)+s.dropRight(index)
	  }
	  rot
	} 
}