package euler.problem3

object Euler3 {
	def main(args: Array[String]) {
		val value = 600851475143L
		val max = Math.sqrt(value).longValue()
		
		var i = 1L
		var found = false
		var bestSolution=0L
		while(i<=max && !found){
		  if(value%i==0){
		    val highFactor = value/i
		    if(isPrime(highFactor)){
		      bestSolution = highFactor
		      found=true
		    } else if(isPrime(i)){
		      bestSolution = i
		    }
		  }
		  i+=1
		}
		
		println("Solution = "+bestSolution)
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