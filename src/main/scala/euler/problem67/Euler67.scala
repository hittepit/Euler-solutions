package euler.problem67
import java.io.BufferedReader
import java.io.InputStreamReader
import euler.problem18.Euler18

object Euler67 {
	def main(args: Array[String]) {
		val f = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("euler/problem67/triangle.txt")))
		var ligne =""
		var data=List[String]()
		do{
		  ligne = f.readLine()
		  if(ligne != null) data=data:::List(ligne)
		}while(ligne!=null)

		println(Euler18.solve(data))
	}

}