package euler.problem55

import euler.utils.Math._

object Euler55 {
	def main(args:Array[String]){
	  println(new Euler55().execute())
	}
}

class Euler55{
  def execute():String = {
    
    val total = (0 /: (1 to 9999))((tot:Int,x:Int) =>{
      var iteration = 0
      var palindrome = false
      var number:BigInt = x
      while(iteration<50 && !palindrome){
        number = number + BigInt(number.toString.reverse)
        palindrome = isPalindrome(number.toString())
        iteration = iteration +1
      }
      
      tot + (if(!palindrome) 1 else 0)
    }
    )
    
    total.toString()
  }
}