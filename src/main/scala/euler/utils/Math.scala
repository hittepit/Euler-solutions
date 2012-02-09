package euler.utils

import scala.math._

object Math {
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
	def fact(i:Long):Long = if(i==0) 1L else i*fact(i-1)

	def isPandigital(s:String):Boolean = {
	 val sAsASet = (s.toSet-'0').map(_.toString.toInt)
	 sAsASet.size==s.length() && (true /: (1 to s.length()))((result:Boolean,n:Int) => result && sAsASet.contains(n))
	} 
	
	def isNinePandigital(s:String) =s.length()==9 && (s.toSet-'0').size==9

	def isNinePandigitalWithZero(s:String) =s.length()==10 && s.toSet.size==10
	
	def weaveElement[T](n:T,l:List[T]):List[List[T]] = {
	  var result = List[List[T]]()
	  (0 to l.size).foreach{(index:Int) =>
	    result+:=(l.dropRight(l.size-index)::: List(n) ::: l.drop(index))
	  }
	  result
	}
	
	def fibo(x:Int,y:Int):Stream[Int] = x #:: fibo(y,x+y)
       
    def sequence(start:Long):Stream[Long] = start #:: sequence(start+1)
       
    def primes(start:Long):Stream[Long] = start #:: sequence(start+1).filter(isPrime(_)) 
       
    def isPrime(x:Long) = !(2L to sqrt(x).toLong).exists(x%_==0)

    def triangle(index:Long):Stream[Long] = (index*(index+1)/2) #:: triangle(index+1)

    def primeFactors(n:Long):Set[Long] = 
	  (Set[Long]()/:primes(2).takeWhile(_<n)){(factors:Set[Long],prime:Long) => 
	    if(n%prime==0) {
    	  factors+prime
	    }else{
	      factors
	    }
	   }
	
    def isTriangle(number:Int) = {
	  val index =(sqrt(1+8*number)-1)/2
	  index.toInt == index
	}
	
  def isPentagonal(number:Long) = {
    val index = (1+sqrt(1+24*number))/6
    index.toLong == index
  }
  
  def isHexagonal(number:Long) = {
    val index = (1+sqrt(1+8*number))/4
    index.toLong == index
  }
}