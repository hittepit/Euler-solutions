package euler.problem37

import euler.utils.Primes._

object Euler37 {
	def main(args: Array[String]) {
		val primes = scala.collection.mutable.Set[Long]()
		var number = 10L
		
		while(primes.size<11){
		  if(isPrimeV2(number)&&leftPrime(number) && rightPrime(number)){
		    println(number)
		    primes+=number
		  }
		  number+=1
		}
		
		println("Result = "+(0L/:primes)(_+_))
	}
	
	def leftPrime(n:Long):Boolean = {
	  val right = n.toString().drop(1).toLong
//	  println("R"+right)
	  if(isPrimeV2(right)){
	    if(right>9){
	      leftPrime(right)
	    } else {
	      true
	    }
	  } else {
	    false
	  }
	}
	
	def rightPrime(n:Long):Boolean = {
	  val left = n.toString().dropRight(1).toLong
//	  println("L"+left)
	  if(isPrimeV2(left)){
	    if(left>9){
	      rightPrime(left)
	    } else {
	      true
	    }
	  } else {
	    false
	  }
	}
}