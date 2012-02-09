package euler.problem42

import euler.utils.Files._
import scala.math._
import euler.utils.Math._

object Euler42 {
	def main(args: Array[String]) {
	  val words = read("euler/problem42/words.txt")(0).split(',').map(_.replaceAll("\"",""))
	  
	  val result = (0 /: words){(total:Int,word:String) =>
	    val value = (0 /: word)(_+_-'A'+1)
	    if(isTriangle(value)) total+1 else total
	   }
	  
	  println(result)
	}
}