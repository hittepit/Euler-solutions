package euler.problem30

object Euler30 {
	def main(args: Array[String]) {
		val max = 10000000 // Au pif?
		val pow = 5
		
		var sum=0L
		
		(2 to max).foreach{(x:Int) =>
		  var n = x
		  var total = 0L
		  while(n!=0){
		    total+=Math.pow(n%10,pow).toLong
		    n = n/10
		  }
		  
		  if(total == x){
		    println(x)
		    sum+=x
		  }
		}
		
		println("Sum = "+sum)
	}
}