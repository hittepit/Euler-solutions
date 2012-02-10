package euler.problem48

object Euler48 {
	def main(args: Array[String]) {
		println(new Euler48().execute)
	}
}

class Euler48 {
  def execute = {
    val s = (BigInt(0)/:(1 to 1000)){(total:BigInt,n:Int) =>
     	total + BigInt(n).pow(n)
    }.toString()
    s.substring(s.length()-10)
  }
}