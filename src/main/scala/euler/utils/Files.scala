package euler.utils
import java.io.BufferedReader
import java.io.InputStreamReader

object Files {
	def read(resource:String) = {
	  val f = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(resource)))
	  var ligne=""
	  var data = List[String]()
	  do{
	    ligne = f.readLine()
	    if(ligne != null) data = data:::List(ligne)
	  }while(ligne != null)
	  f.close()
	  data
	}
}