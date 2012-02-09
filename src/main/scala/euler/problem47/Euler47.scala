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
	  var n =  2*3*5*7
	  while(!hasXPrimeFactors(n,consecutive) || !hasXPrimeFactors(n+1,consecutive) || !hasXPrimeFactors(n+2,consecutive) || !hasXPrimeFactors(n+3,consecutive)){
	    n+=1
	  }
	  n.toString
	}
	
	def hasXPrimeFactors(number:Long,x:Int) = {
	  if(isPrime(number))
	    false
	    else {
		  var total = 0
		  val primeGenerator = primes(2).iterator
		  var n = primeGenerator.next
		  var rest = number
		  while(total<=x && n<=rest){
		    if(rest%n == 0) total+=1
		    while(rest%n==0){
		      rest/=n
		    }
		    n = primeGenerator.next
		  }
		  if(total>x) println(number +" ->"+total)
		  total==x
	    }
	}
}