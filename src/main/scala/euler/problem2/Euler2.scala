package euler.problem2


object Euler2 {
	def main(args: Array[String]) {
		var i = 2
		var j = 3
		var total = 0L
		while(i<4000001){
		  total+=i
			fibo(fibo(fibo(i,j))) match {
			  case (a,b) => i=a;j=b
			}
		}
		
		println(total)
	}
	
	def fibo(c:(Int,Int)):(Int,Int) = (c._2,c._1+c._2)
}

class Euler2 {
  def execute = {
		var i = 2
		var j = 3
		var total = 0L
		while(i<4000001){
		  total+=i
			fibo(fibo(fibo(i,j))) match {
			  case (a,b) => i=a;j=b
			}
		}
		total.toString()
  }
	
	def fibo(c:(Int,Int)):(Int,Int) = (c._2,c._1+c._2)
}