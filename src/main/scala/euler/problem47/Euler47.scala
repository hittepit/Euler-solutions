package euler.problem47

import euler.utils.Math._

import scala.math._

object Euler47 {
	def main(args: Array[String]) {
		println(new Euler47().execute)
	}
}

class Euler47{
	val consecutive = 4
	def execute = {
	  sequence((1L/:primes(2).take(consecutive))(_*_)).find{(n:Long) =>
	    !(n+0 until n+consecutive).exists{(index:Long) =>countPrimeFactors(index)!=consecutive}
	  }
	}
	
	def countPrimeFactors(n:Long) = {
		(0L/:primes(2).takeWhile(_<n)){(total: Long, prime:Long) => 
	    	if(n%prime==0) {
	    		  total+1
	    	}else{
	    		total
	    	}
		}
	}
}