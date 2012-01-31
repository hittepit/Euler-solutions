package euler.problem26


object Euler26 {
	def main(args: Array[String]) {
	  var maximum = 0
	  var d=0
	  (1 until 1000).foreach{(x:Int) =>
	    val periodLength = findPeriod(x).size
	    if(periodLength>maximum){
	      maximum = periodLength
	      d=x
	    }
	  }
	  
	  println(d, findPeriod(d))
	}
	
	def findPeriod(n:Int) = {
	  var rests = List[Int]()
	  var soldes = List[Int]()
	  var found = false
	  var number = 10
	  var indexBegin = -1
	  while(!found){
		  val rest = number%n
		  val solde = number/n
		  if(rests.contains(rest)){
		    found = true
		    indexBegin = rests.indexOf(rest)
		  }
			  rests= rests ::: List(number/10)
			  soldes = soldes ::: List(solde)
			  number = rest*10
	  }
	  soldes.drop(indexBegin)
//	  (soldes,indexBegin)
	}
	
	def dixExp(n:Int) = (10/:(1 to n))(_*_)
	
}