package euler.problem20

object Euler20 {
	def main(args: Array[String]) {
		val fact100 = fact(100).toString
		println((0/:fact100)((total:Int,c:Char) => total+c.toString.toInt))
	}
	
	def fact(i:BigInt):BigInt = if(i==0) BigInt(1) else i*fact(i-1)
}