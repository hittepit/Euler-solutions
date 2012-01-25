package euler.problem12

object Euler12 {
	def main(args: Array[String]) {
	  var start = 0
	  var nDivisor = 0
	  var precTriangle = 0
	  do{
	    start+=1
		precTriangle+=start
		nDivisor = totalDivisor(precTriangle)
		println(precTriangle+" "+nDivisor)
	  }while(nDivisor<500)
	    
	  println("Solution = "+precTriangle)
	}
	
	def totalDivisor(x:Int) = {
	  var total = 0
	  val max = Math.sqrt(x).toInt

	  (1 to max).foreach{(i:Int)=> if(x%i==0) if(x==max)total+=1 else total+=2}
	  total
	}
}