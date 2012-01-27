package euler.problem15

import scala.actors.Actor

object Euler15 {
	def main(args: Array[String]) {
	  var l = List(1L)
	  for(i <- 1 to 40){
	    l= expand(l)
		  println(l)
	  }
	  println(l(20))
	}

	def expand(l:List[Long]):List[Long] = {
	  val s = for(i <- 0 until l.size) yield {if(i==0) 1 else l(i-1)+l(i)}
	  s.toList:::List(1L)
	}
}
