package euler.problem7
    
	import euler.utils.Math.isPrime
import euler.utils.Timer
	
	/**
	 * Solution 1 more functionnal but much more slower. Needs a max number (105000) empiracally determined
	 */
	object Euler7 extends Timer{
		def main(args: Array[String]) {
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
			  if(isPrime(start)){
			    index +=1
			  }
		  }
		  start
		}
	}

  class Euler7 {
    def execute = solve(10001).toString

    def solve(nth:Int):Long = {
		  var index = 0
		  var start:Long = 1L
		  while(index<nth){
			  start+=1
			  if(isPrime(start)){
			    index +=1
			  }
		  }
		  start
		}
  }