package euler{
  import utils.Primes._
  
  package problem27{

	object Euler27 {
		def main(args: Array[String]) {
		  
		  var maximumPrimes = 0
		  var amax = -1000
		  var bmax = -1000
		  
			(-999 to 999).foreach{(a:Int)=>
			  (0 to 999).foreach{(b:Int) =>
			    val n = numberOfPrimes(a,b)
			    if(n>maximumPrimes){
			      maximumPrimes = n
			      amax=a
			      bmax=b
			      println(maximumPrimes+" "+a+" "+b)
			    }
			  }
			}
		  
		  println("a="+amax+", b="+bmax+", a*b ="+amax*bmax)
		}
		
		def numberOfPrimes(a:Int,b:Int):Int = {
		  var result=0
		  var index = 0
		  do{
			  result = index*index+a*index+b
			  index+=1
		  }while(result>0 && isPrimeV2(result))
		    
		  index-2
		}
	}
  }
}