package euler.problem23

object Euler23 {
	def main(args: Array[String]) {
	  val abundant = abundantNumbers(28123)
	  println(abundant)
	  var total = 0L
	  val correctNumbers = (1L to 28123L).par.filter{(x:Long) =>
	    var i = 0
	    var isNotSum = true
	    while(i<abundant.size && abundant(i)<= x/2 && isNotSum){
	      if(abundant.contains(x-abundant(i))){
	        isNotSum=false
	      }
	      i += 1
	    }
	    isNotSum
	  }
	  
	  println(correctNumbers)
	  
	  println("Somme = "+(0L/:correctNumbers)(_+_))
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
}