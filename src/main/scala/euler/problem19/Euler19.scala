package euler.problem19


import java.util.GregorianCalendar
import java.util.Calendar._

object Euler19 {
	def main(args: Array[String]) {
		var total=0
		for(year <- 1901 to 2000){
		  for(month <- JANUARY to DECEMBER){
		    val g = new GregorianCalendar(year,month,1,0,0,0)
		    if(g.get(DAY_OF_WEEK) == SUNDAY) total+=1
		  }
		}
		
		println(total)
	}
}