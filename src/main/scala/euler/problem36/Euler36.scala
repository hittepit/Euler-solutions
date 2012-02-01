package euler.problem36

object Euler36 {
	def main(args: Array[String]) {
	  val numbers = scala.collection.mutable.Set[Int]()
	  
		(1 to 999).foreach{(n:Int) =>
		  val sf = n.toString
		  val ss = sf.dropRight(1)
		  val p1 = sf+sf.reverse
		  val p2 = ss+sf.last+ss.reverse
		  
		  if(isPalindrome(Integer.toBinaryString(p1.toInt))){
		    numbers+=p1.toInt
		  }
		  if(isPalindrome(Integer.toBinaryString(p2.toInt))){
		    numbers+=p2.toInt
		  }
		}
	  
	  println("Result = "+(0/:numbers)(_+_))
	}
	
	def isPalindrome(s:String) = (true /: (0 to s.length()/2))((state:Boolean,index:Int) =>
	  state && (s.charAt(index)==s.charAt(s.length-index-1))
	  )
}