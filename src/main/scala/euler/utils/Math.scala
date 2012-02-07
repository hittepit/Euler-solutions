package euler.utils

object Math {
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
	def fact(i:Long):Long = if(i==0) 1L else i*fact(i-1)

	def isPandigital(s:String):Boolean = isPandigital(s,s.length())
	def isPandigital(s:String,neededLength:Int) = s.length()==neededLength && (s.toSet-'0').size==neededLength
	def isNinePandigital = (s:String) => isPandigital(s,9)
}