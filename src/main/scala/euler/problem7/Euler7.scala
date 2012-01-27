package euler{
  package problem7{
    
	import problem3.Euler3
	import utils.Timer
	import utils.Primes._
	
	/**
	 * Solution 1 more functionnal but much more slower. Needs a max number (105000) empiracally determined
	 */
	object Euler7 extends Timer{
		def main(args: Array[String]) {
	//		println(solve1(10001))
			println(solve2(10001))
		}
		
	//	def solve1(nth:Int):Long = time("solution1"){() =>
	//	  val r = (2L to 105000L).toList
	//	  findPrime(r,1,nth)
	//	}
	//	
	//	def findPrime(candidates:List[Long], index:Int, nth:Int):Long = candidates match {
	//	  case n::l => if(index == nth) n else findPrime(l.filter{_%n!=0}, index+1, nth)
	//	  case _ => 0L
	//	}
		
		def solve2(nth:Int):Long = time("solution2"){() =>
		  var index = 0
		  var start:Long = 1L
		  while(index<nth){
			  start+=1
			  if(isPrimeV1(start)){
			    index +=1
			  }
		  }
		  start
		}
	}
  }
}