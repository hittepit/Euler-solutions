package euler.problem58

import euler.utils.Math._

object Euler58 {
  def main(args: Array[String]) {
	println(new Euler58().execute)
  }
}

class Euler58{
  def execute = {
    	var d1 = 1L
		var d2 = 1L
		var d3 = 1L
		var d4 = 1L
		var d = 1L
		
		var inc=2
		var prime = 0
		var length = 1
		
		do{
		  d1+=inc
		  if(isPrime(d1)) prime+=1
		  inc+=2
		  d2+=inc
		  if(isPrime(d2)) prime+=1
		  inc+=2
		  d3+=inc
		  if(isPrime(d3)) prime+=1
		  inc+=2
		  d4+=inc
		  if(isPrime(d4)) prime+=1
		  inc+=2
		  d+=4
		  length+=2
		}while(prime.toDouble/d>=0.1)
		  
		length.toString
  }
}