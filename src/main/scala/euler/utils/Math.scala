package euler.utils

object Math {
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
	def fact(i:Long):Long = if(i==0) 1L else i*fact(i-1)

	def isPandigital(s:String):Boolean = {
	 val sAsASet = (s.toSet-'0').map(_.toString.toInt)
	 sAsASet.size==s.length() && (true /: (1 to s.length()))((result:Boolean,n:Int) => result && sAsASet.contains(n))
	} 
	
	def isNinePandigital(s:String) =s.length()==9 && (s.toSet-'0').size==9
	
	def weaveElement[T](n:T,l:List[T]):List[List[T]] = {
	  var result = List[List[T]]()
	  (0 to l.size).foreach{(index:Int) =>
	    result+:=(l.dropRight(l.size-index)::: List(n) ::: l.drop(index))
	  }
	  result
	}
	
	def combine[T](l:List[T]):List[List[T]] = l match {
	  case a::Nil => List(List(a))
	  case n::rest =>  var result = List[List[T]]() 
	  				combine(rest).foreach{ (el:List[T]) =>  
	  				  result:::=weaveElement(n,el)
	  				}
	  				result
	}
}