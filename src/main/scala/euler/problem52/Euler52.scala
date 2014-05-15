package euler.problem52

object Euler52{
	def main(args:Array[String]) {
	  println(new Euler52().execute)
	}
}

class Euler52 {
	def execute:String = {
	  var nDigit = 2
	  
	  var solution:Option[Long] = None
	  
	  do{
		  val end = ("1"+"6"*(nDigit-1)).toLong
		  solution = (("1"+"0"*(nDigit-1)).toLong to end).find(isSolution(_))
		  nDigit+=1
	  }while(solution==None)
	  
	  solution.get.toString()
	}
	
	def isSolution(number:Long):Boolean = {
		  var liste:List[Char] = Nil
		    !(1 to 6).exists{(n:Int) =>
		      val l = (n*number).toString().toList.sortWith(_<_)
		      if(liste == Nil) liste =l
		      l!=liste
		    }
	}
}