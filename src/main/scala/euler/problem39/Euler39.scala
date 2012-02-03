package euler.problem39

object Euler39 {
	def main(args: Array[String]) {
	  var maxSolution = (0,0)
		for(p <- 1000 to 1 by -1){
		  var solutions = 0 
		  for(a <- 1 to p;b <- 1 to p){
		    val c = scala.Math.sqrt(a*a+b*b)
		    if(c.toInt == c && a+b+c==p){
		      solutions+=1
		    }
		  }
		  
		  if(solutions > maxSolution._2){
		    maxSolution = (p,solutions)
		  }
		}
	  
	  println("Solution = "+maxSolution)
	}
}