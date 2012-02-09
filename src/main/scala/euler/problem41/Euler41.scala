package euler.problem41

import euler.utils.Math._


object Euler41 {
	def main(args: Array[String]) {
	  var solution = 0
	  (9 to 2 by -1).foreach{(i:Int) =>
	    val l = (1 to i).toList
	    l.permutations.foreach{(candidateList:List[Int]) =>
	      val candidate = (0/:candidateList)(_*10+_)
	      if(isPrime(candidate) && candidate>solution){
		    solution = candidate
		  }
	    }
	  }
	  
	  println(solution)
	}
}