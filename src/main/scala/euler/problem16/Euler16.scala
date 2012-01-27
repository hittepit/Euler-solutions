package euler.problem16


/*
 * Exp 1000 = Exp 2,2,5,5,5
 */
object Euler16 {
	def main(args: Array[String]) {
		val result = BigInt(2).pow(1000)
		println(result.toString)
		println((0L/:result.toString.toSeq)(_+_.toString.toLong))
	}
	
}