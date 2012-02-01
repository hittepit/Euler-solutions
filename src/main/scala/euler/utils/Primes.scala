package euler.utils

import scala.math._

object Primes {
	def isPrimeV1(value:Long) = {
	  val max = sqrt(value).longValue()
	  var i = 2L
	  var prime = true
	  while(i<=max && prime){
	    prime=value%i!=0
	    i+=1
	  }

	  prime
	}
	
	def isPrimeV2(value:Long) = ! (2L to sqrt(value).longValue()).exists(value%_==0)

}