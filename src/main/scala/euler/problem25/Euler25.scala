package euler.problem25

object Euler25 {
	def main(args: Array[String]) {
		var i = BigInt(1)
		var j = BigInt(1)
		var index = 2
		while(i.toString.length()<1000){
		  val temp = i+j
		  j=i
		  i=temp
		  index+=1
		}
		
		println(index+"->"+i)
	}
	
	
}