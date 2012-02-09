package euler.problem45

import scala.math._
import euler.utils.Math._

object Euler45 {
	def main(args: Array[String]) {
		println(new Euler45().execute)
	}
}

class Euler45 {
  def execute = triangle(286).find{(candidate:Long) => isPentagonal(candidate) && isHexagonal(candidate)}.get.toString
}