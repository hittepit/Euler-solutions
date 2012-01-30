package euler.problem17

object Euler17 {
	val numbers = Map(1->"one", 2->"two", 3->"three", 4->"four",5->"five",
	    6->"six",7->"seven",8->"eight",9->"nine",10->"ten",
	    11->"eleven",12->"twelve",13->"thirteen",14->"fourteen",15->"fifteen",
	    16->"sixteen", 17->"seventeen",18->"eighteen",19->"nineteen",20->"twenty",
	    30->"thirty",40->"forty",50->"fifty",60->"sixty",70->"seventy",80->"eighty",90->"ninety",
	    100->"hundred",1000->"thousand")
	
	def main(args: Array[String]) {
	  val n = text((Math.random*1000+1.0).toInt)
	  
		(1 to 10).foreach{(i:Int) => text((Math.random*1000+1.0).toInt)}
	  println((0L/:(1L to 1000L))((total:Long,n:Long) => total+text(n.toInt)))
	}
	
	def text(n:Int) = {
	  val thousands = n/1000
	  val hundreds = (n%1000)/100
	  val tens = (n%100)/10
	  val units = n%10
	  var s= if(thousands!=0) "one thousand" else ""
	  if(hundreds != 0) {
	    s+=" "+numbers(hundreds)+" hundred"
	    if(tens!=0 || units!=0){
	      s+=" and"
	    }
	  }
	  if(tens == 1){
	    s+=" "+numbers(tens*10+units)
	  } else { 
		  if(tens !=0){
			  s+=" "+numbers (tens*10)
		  }
		  if(units!=0){
		    s+=" "+numbers(units)
		  }
	  }
	  
	  
//	  println(n+"->"+s+" = ")
	  s.replaceAll(" ","").length
	  
	}
}