package euler.problem24

import euler.utils.Math._

object Euler24 {
	val index = 1000000-1

	def main(args: Array[String]) {
		val liste = List(0,1,2,3,4,5,6,7,8,9)
		println((""/:solve(liste,0))(_+_.toString()))
	}
	
	def solve(rest:List[Int],start:Int):List[Int] = rest match {
	  case List(n) => rest
	  case _ => val f = fact(rest.size-1)
	  			val i = (index-start)/f
	  			val newStart = start+i*f
	  			List(rest(i.toInt)):::solve(rest.dropRight(rest.size-i.toInt):::rest.drop(i.toInt).tail,newStart.toInt)
	}
}