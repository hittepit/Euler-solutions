package euler.problem31

object Euler31 {
	def main(args: Array[String]) {
		val target = 200
	  
		val l2 = 200
		val l1 = 100
		val p50 = 50
		val p20 = 20
		val p10 = 10
		val p5 = 5
		val p2 = 2
		val p1 = 1

		val values = List[Int](200,100,50,20,10,5,2,1)
		
		val result = totalCombinations(values,200)
		
		println(result)
	}
	
	def totalCombinations(values:List[Int],target:Int):Int = values match{
	  case List() => 0
	  case value::remainingValues => 
	    (0/:(0 to 200/value)){(totalComb:Int,n:Int) =>
	      if(n*value == target){
	        totalComb+1
	      } else {
	        totalComb+totalCombinations(remainingValues,target-n*value)
	      }
	    }
	}
}