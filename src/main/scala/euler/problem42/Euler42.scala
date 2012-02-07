package euler.problem42

import euler.utils.Files._
import scala.math._

object Euler42 {
	var triangles = List[Int]()

	def main(args: Array[String]) {
	  val words = read("euler/problem42/words.txt")(0).split(',').map(_.replaceAll("\"",""))
	  
	  val result = (0 /: words){(total:Int,word:String) =>
	    val value = (0 /: word)(_+_-'A'+1)
	    if(isTriangle(value)) total+1 else total
	   }
	  
	  println(result)
	}
	
	def triangle(n:Int) = n*(n+1)/2
	
	def isTriangle(v:Int) = {
	  val n =(sqrt(1+8*v)-1)/2.0
	  n.toInt == n
	}
}