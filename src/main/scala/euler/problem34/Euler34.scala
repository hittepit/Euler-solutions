package euler{
  import utils.Math._
  
  package problem34{

	object Euler34 {
	  def main(args: Array[String]):Unit = {
		var result:BigInt = 0
		var i = 3L
		
		val max = fact(9)+fact(8)+fact(7)+fact(6)+fact(5)+fact(4)+fact(3)+fact(2)+1
		
		while(i<=max){
		  val somme = (BigInt(0)/:i.toString()){(total:BigInt,c:Char) => total + fact(BigInt(c.toString))}
		  if(somme==i){
		    result+=i
		    println(i,result)
		  }
		  i+=1
		}
		
		println(result)
	  }
	}
  }
}