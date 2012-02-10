package euler.problem50

import euler.utils.Math._

object Euler50 {
	def main(args: Array[String]) {
		println(new Euler50().execute)
	}
}

class Euler50 {
  var longuestSequence = 0
  var numberWithLonguestSequence = 0
  def execute = {
    val primeNumbers = primes(2).takeWhile(_<1000000).toList
    primeNumbers.takeWhile(_<1000000).foreach{(number:Long) =>
      (0 to 3).foreach{(seed:Int) =>
	      var rest = number
	      var numberOfTerms = 0
//	      val primeGenerator = primes(seed).iterator
	      val primeGenerator = primeNumbers.takeRight(primeNumbers.size-seed).iterator
	      while(rest>0){
	        rest-=primeGenerator.next()
	        numberOfTerms+=1
	      }
	      numberOfTerms-=1
	      if(rest==0 && numberOfTerms>longuestSequence){
	        longuestSequence = numberOfTerms
	        numberWithLonguestSequence = number.toInt
	      }
	    }
    }
    
    println(longuestSequence)
    numberWithLonguestSequence.toString()
  }
}