package euler.problem3

object Euler3 {
	def main(args: Array[String]) {
		val value = 600851475143L
		
		var i = value
		while(i>=1){
		  if(value%i==0 && isPrime(i)){
		    println("Solution = "+i)
		    System.exit(0)
		  }
		  i-=1
		}
	}
	
	def isPrime(value:Long) = {
	  val max = Math.sqrt(value).longValue()
	  var i = 2L
	  var prime = true
	  while(i<=max && prime){
	    prime=value%i!=0
	    i+=1
	  }
	  
	  prime
	}
}