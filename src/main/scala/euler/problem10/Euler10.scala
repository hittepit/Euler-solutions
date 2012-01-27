package euler{
	
  package problem10{
	import scala.actors.Actor._
  import scala.actors._

	import utils.Primes._
  import utils.Timer

	object Euler10 extends Timer{
	  def main(args: Array[String]) {
	         println(solution1(2000000L))
	         println(solution2(2000000L))
	  }
	 
	  def findPrimes(cleanedNaturals:List[Long],primes:List[Long]):(List[Long],List[Long]) = cleanedNaturals match {
	    case List() => (cleanedNaturals,primes)
	    case n::l => findPrimes(l.filter(_%n!=0),n::primes)
	  }
	  
	  def solution1(max:Long) = time("solution 1"){() =>
	         val l = (2L to 2000000L).filter(isPrimeV1(_))
	         (0L/:l)(_+_)
	  }
	  
	  def solution2(max:Long) = time ("solution 2"){() =>
	         val l = (2L to 2000000L).par.filter(isPrimeV1(_))
	         (0L/:l)(_+_)
	  }
	  
	  def solution3(max:Long) = time ("solution 3"){() =>
	    val solution = findPrimes((2L to max).toList,Nil)
	    (0L/:solution._2)(_+_)
	  }
	
  }
  }
}

