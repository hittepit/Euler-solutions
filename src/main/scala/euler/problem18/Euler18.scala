package euler.problem18
import java.io.File
import java.io.FileReader
import java.io.BufferedReader
import java.io.InputStreamReader
import euler.utils.Timer
import euler.utils.Files._

object Euler18 extends Timer{
	def main(args: Array[String]) {
	  val data = read("euler/problem18/numbers.txt")

		println(solve(data))
	}
	
	def reduce(lastComputedLine:List[Int],tree:List[String]):List[Int] = lastComputedLine match {
	  case List() => val li = tree(tree.size-1).split(" ").map(_.toInt).toList
	  				reduce(li,tree)
	  case List(n) => List(n)
	  case l:List[Int] => val newLine = tree(l.size-2).split(" ").map(_.toInt).toList
	  						var verNewLine = List[Int]()
	  						(0 to newLine.size-1).foreach((index:Int)=>
	  						  		verNewLine= verNewLine:::List(newLine(index) + Math.max(l(index),l(index+1)))
	  						 )
	  						 reduce(verNewLine,tree)
	}
	
	def solve(triangle:List[String]) = time("solution"){() => reduce(List[Int](),triangle)(0)}
}
