package euler.utils

object Math {
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
	def fact(i:Long):Long = if(i==0) 1L else i*fact(i-1)
}