package euler.problem12

import euler.utils.Math._

object Euler12 {
	def main(args: Array[String]) {
	  println(new Euler12().execute)
	}
}

class Euler12 {
  def execute = {
    triangle(1).find((number:Long) => totalDivisor(number) > 500).get.toString
  }
	
	def totalDivisor(x:Long) = {
	  var total = 0
	  val max = Math.sqrt(x).toLong

	  (1L to max).foreach{(i:Long)=> if(x%i==0) if(x==max)total+=1 else total+=2}
	  total
	}
}