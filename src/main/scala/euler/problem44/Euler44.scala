package euler.problem44

import scala.math._

object Euler44 {
	def main(args: Array[String]) {
	  val euler = new Euler44
	  println(euler.execute)
	}
}

class Euler44 {
  def execute = {
    var smallest = 1000000000000L
    for(i1 <- 1 to 10000 ; i2<-1 to 10000){
      val n1 = pentagonal(i1)
      val n2 = pentagonal(i2)
      if(isPentagonal(abs(n1-n2)) && isPentagonal(n1+n2) && abs(n1-n2) < smallest) smallest = abs(n1-n2)
    }
    smallest.toString
  }
  
  def isPentagonal(number:Long) = {
    val index = (1+sqrt(1+24*number))/6
    index.toLong == index
  }
  
  def pentagonal(index:Long) = index*(3*index-1)/2
}