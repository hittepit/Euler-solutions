package euler.problem23

import euler.utils.Math.sequence

import scala.collection.mutable

object Euler23 {
	def main(args: Array[String]) {
	  val numbers = mutable.Set[Int]()
	  (1 to 28213).foreach(numbers+=_)
	  val abundant = abundantNumbers(28123)
	  for(i <- abundant;
		  j <- abundant;if(i<=14062)){
	    numbers-=(i+j).toInt
	  }
	  
	  var sum = (0l /: numbers)(_+_)
	  println(sum)
	}
	
	def properDivisors(n:Long) = {
	  (1L to n-1).filter(n%_==0)
	}
	
	def isAbundant(n:Long) = {
	  (0L/:properDivisors(n))(_+_) > n
	}
	
	def abundantNumbers(max:Long) = {
	  (1L to max).filter(isAbundant(_))
	}
	
//	def lazyAbundantNumbers(start:Long, max:Long):Stream[Long] = 
//	  sequence(start).find(isAbundant(_)) match {
//	    case Some(l) => if(l<=max) l #:: lazyAbundantNumbers(l+1, max) else Stream.Empty
//	    case None => Stream.Empty
//	  }
}