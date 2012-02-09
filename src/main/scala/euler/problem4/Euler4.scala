package euler.problem4



object Euler4 {
	def main(args: Array[String]) {
		var solution=(0,0,0)
		var alpha = 999
		while(alpha>99){
		  var beta = alpha
		  while(beta>99){
		    val result = alpha*beta
		    if(isPalindrome(result) && result>solution._3) {
		      solution = (alpha,beta,result)
		    }
		    beta-=1
		  }
		  alpha-=1
		}
		
		println(solution)
	}
	
	def isPalindrome(i:Int) = {
	  val s=i.toString()
	  val center = s.length()/2-1
	  (0 to center).find((x:Int)=>s(x)!=s(s.length()-x-1)) match {
	    case None => true
	    case _ => false
	  }
	}
}

class Euler4 {
	def execute = {
		var solution=0
		for(alpha <- 999 to 100 by -1 ; beta <- alpha to 100 by -1){
		    val result = alpha*beta
		    if(isPalindrome(result.toString) && result>solution) {
		      solution = result
		    }
		}
		
		solution.toString()
	}
	
	def isPalindrome(s:String) = ! (0 to  s.length()/2-1).exists{(x:Int) => s(x) != s(s.length-x-1)}
}