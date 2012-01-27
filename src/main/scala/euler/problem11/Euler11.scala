package euler.problem11
import java.io.BufferedReader
import java.io.InputStreamReader
import scala.collection.mutable.ArrayBuffer

object Euler11 {
	def main(args: Array[String]) {
	  val f = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("euler/problem11/data.txt")))
	  var ligne=""
	  val dataBuffer = ArrayBuffer[Array[Int]]()
	  do{
	    ligne = f.readLine()
	    if(ligne != null) dataBuffer += ligne.split(" ").map(_.trim.toInt).toArray
	  }while(ligne!=null)
	    
	  val data = dataBuffer.toArray
	  val ymax = data.length-1
	  val xmax = data(0).length-1
	  
	  var maxProd = 0
	  
	  //Lignes horizontales
	  for(y <- 0 to ymax){
	    for(x <- 0 to xmax){
	      if(x<xmax-2){
	    	  val prodH = data(x)(y)*data(x+1)(y)*data(x+2)(y)*data(x+3)(y)
	    	  if(prodH>maxProd) maxProd = prodH
	    	  if(y<ymax-2){
	    	    val prodD1 = data(x)(y)*data(x+1)(y+1)*data(x+2)(y+2)*data(x+3)(y+3)
	    	    if(prodD1>maxProd) maxProd = prodD1
	    	  }
	      }
	      if(y<ymax-2){
	        val prodV = data(x)(y)*data(x)(y+1)*data(x)(y+2)*data(x)(y+3)
	        if(prodV>maxProd) maxProd=prodV
	      }
	      if(x>2 && y<ymax-2){
	        val prodD2 = data(x)(y)*data(x-1)(y+1)*data(x-2)(y+2)*data(x-3)(y+3)
	        if(prodD2>maxProd) maxProd=prodD2
	      }
	    }
	  }
	  
	  println(maxProd)
	}
}