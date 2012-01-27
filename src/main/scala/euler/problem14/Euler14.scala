package euler.problem14

import scala.collection._

object Euler14 {
	val m = mutable.Map[Long,Long]()
	
	def main(args: Array[String]) {
		
	  (1L to 999999L).map(compute(_))
	  
	  println(((0L,0L)/:m)((i:(Long,Long),v:(Long,Long)) => if(v._2>i._2) v else i)._1)
	}
	
	def compute(value:Long):Long = {
	  var nombres = 1L
	  var n = value
	  while(n!=1){
	    if(n<1) System.exit(0)
	    val i = m.getOrElse(n,0L)
	    if(i != 0){
	      nombres+=i
	      n= 1
	    } else{
	      nombres += 1
	      if(n%2==0){
	        n = n/2
	      } else {
	        n = 3*n+1
	      }
	    } 
	  }
      m+=((value,nombres))
	  nombres
	}
}