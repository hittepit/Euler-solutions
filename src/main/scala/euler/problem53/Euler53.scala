package euler.problem53

object Euler53{
  def main(args: Array[String]) {
	  println(new Euler53().execute)
  }
}

class Euler53 {
	val cache = scala.collection.mutable.Map[Long,BigInt]()
	
	cache+=(0L->1)
	
	def execute():String = {
	  var total = 0L
	  (1L to 100L).foreach{(n:Long) =>
	    (1L to n).foreach{(r:Long) =>
	      if(c(n,r) > 1000000) total+=1
	    }
	  }
	  total.toString
	}
	
	def c(n:Long,r:Long):BigInt = {
	  val factn = fact(n)
	  cache+=(n->factn)
	  val factr = fact(r)
	  cache+=(r->factr)
	  val factnr = fact(n-r)
	  cache+=(n-r->factnr)
	  factn/factr/factnr
	}
	
	def fact(n:Long):BigInt = if(cache.contains(n)) cache(n) else n*fact(n-1)
}