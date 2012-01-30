package euler.problem21

object Euler21 {
	def main(args: Array[String]) {
	  
	  val number = 10000L
	  var pairNumber = 0L
	  for(n <- 1L to number){
	    val d = sumOfDivisors(n)
	    val dd = sumOfDivisors(d)
	    if(dd==n && n!=d){
	      println(n+" "+d)
	      pairNumber +=(n+d)
	    }
	  }
	  
	  println("Result = "+pairNumber/2)
	}
	
	def sumOfDivisors(n:Long) = {
	  val max = Math.sqrt(n)
	  ((0L/:(1L to max.toLong))((total:Long,i:Long) => total + (if(n%i==0){if(i==max || i==1) i else i+n/i} else 0)))
	}
}