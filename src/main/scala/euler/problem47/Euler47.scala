package euler.problem47

import euler.utils.Math._
import euler.utils.Timer
import scala.math._

object Euler47 {
	def main(args: Array[String]) {
		println(new Euler47().execute)
	}
}

class Euler47 extends Timer{
	val consecutive = 4
	def execute = time("Euler47"){() =>
	  var n =  (1L/:primes(2).take(consecutive))(_*_)
	  var cons = 0
	  do{
		  while(hasXPrimeFactors(n,consecutive) && cons<consecutive){
		    n+=1
		    cons+=1
		  }
		  if(cons!=consecutive){
		    n+=1
		    cons=0
		  }
	  }while(cons!=consecutive)
//	  while(!hasXPrimeFactors(n,consecutive) || !hasXPrimeFactors(n+1,consecutive) || !hasXPrimeFactors(n+2,consecutive) || !hasXPrimeFactors(n+3,consecutive)){
//	    n+=1
//	  }
	  (n-cons).toString
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
		  total==x
	    }
	}
}