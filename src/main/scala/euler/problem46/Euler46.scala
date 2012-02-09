package euler.problem46

import scala.math._
import euler.utils.Math._

object Euler46 {
	def main(args: Array[String]) {
	  println(new Euler46().execute)
	}
}

class Euler46{
  def execute = oddComposite(9).find{(composite:Long) => !isAGoodOne(composite)}.get.toString
  
  def isAGoodOne(n:Long) = primes(2).takeWhile(_<n).exists{(prime:Long) =>
    val x = sqrt((n-prime)/2)
    x.toLong==x
  }
  
  def plus2(n:Long):Stream[Long] = n #:: plus2(n+2)
  def oddComposite(n:Long):Stream[Long] = n #:: plus2(n+2).filter(!isPrime(_)) 
}