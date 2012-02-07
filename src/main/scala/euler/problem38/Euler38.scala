package euler.problem38

import euler.utils.Math._

object Euler38 {
	def main(args: Array[String]) {
	  var maximum = 0
	  
	  (2 to 7).foreach{(max:Int) =>
	    val mult = (1 to max).toList
	    (1 to 99999).foreach{(n:Int) =>
	      val s = concatenedProduct(n,mult)
	      if(isNinePandigital(s) && s.toInt>maximum) {
	        println(n+"*"+mult+"="+s)
	        maximum = s.toInt
	      }
	    }
	  }
	  
	  println("Solution = "+maximum)
	}
	
	def concatenedProduct(n:Int,mult:List[Int]) = {
	  val products = mult.map{(i:Int) =>(i*n).toString}//.sortWith(_>_)
	  (""/:products)(_+_)
	}
}