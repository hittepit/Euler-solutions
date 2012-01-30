package euler.utils

object Math {
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
}