package euler.problem13

import euler.utils.Files._

object Euler13 {
	def main(args: Array[String]) {
		val data = read("euler/problem13/data.txt")
		var sol = (0L/:data)((total:Long,s:String) => s.substring(0,13).toLong+total)
		
		while(sol>9999999999L) sol = sol/10
		
		println(sol)
	}
}