package euler.problem33

object Euler33 {
	def main(args: Array[String]) {
	  var prodNum = 1
	  var prodDen = 1
		(10 to 98).foreach{(num:Int) =>
		  (num+1 to 99).foreach{(den:Int) =>
		    val num1 = num/10
		    val den1 = remove(den,num%10)
		    if(num%10 != 0 && num1.toDouble/den1.toDouble == num.toDouble/den.toDouble){
		      println(num+"/"+den+" = "+num1+"/"+den1)
		      prodNum*=num
		      prodDen*=den
		    }
		    
		    val num2 = num%10
		    val den2 = remove(den,num/10)
		    if(num%10 != 0 && num2.toDouble/den2.toDouble == num.toDouble/den.toDouble){
		      println(num+"/"+den+" = "+num2+"/"+den2)
		      prodNum*=num
		      prodDen*=den
		    }
		  }
		}
	  
	  val solution = prodDen/gcd(prodNum,prodDen)
	  println("Result = "+prodNum+" / "+prodDen+", solution = "+solution)
	}
	
	def remove(n:Int,digit:Int) = {
	  if(n/10 == digit){
	    n%10
	  } else if(n%10 == digit){
	    n/10
	  } else {
	    n
	  }
	}
	
	def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}