package euler.problem5

object Euler5 {
	def main(args: Array[String]) {
	  val max =20L
	  println(solve(max))
	  
	}
	
	def solve(max:Long) = (1L/:(2L to max))(ppcm(_,_))
	
	def ppcm(a:Long,b:Long):Long = (a*b)/pgcd(a,b)
	
	def pgcd(a:Long,b:Long):Long = if(b==0) a else pgcd(b,a%b)
}
