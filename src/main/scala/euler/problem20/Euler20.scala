package euler.problem20

import euler.utils.Math._

object Euler20 {
	def main(args: Array[String]) {
		val fact100 = fact(100).toString
		println((0/:fact100)((total:Int,c:Char) => total+c.toString.toInt))
	}
}