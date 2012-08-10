package euler.problem57

import euler.utils.Rational

object Euler57 {
	def main(args: Array[String]) {
	  println(new Euler57().execute)
	}
}

class Euler57{
  val one = new Rational(1)
  
  def execute = {
    squareOfTwo(new Rational(3,2)).take(1000)
    	.filter(r => r.num.toString.length>r.den.toString.length)
    	.size.toString
  }
  
  def squareOfTwo(seed:Rational):Stream[Rational] = seed #:: squareOfTwo(one+one/(one+seed))
}