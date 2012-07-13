package euler.problem56

object Euler56 {
	def main(args:Array[String]){
	  println(new Euler56().execute())
	}
}

class Euler56{
  def execute():String = {
    var maximum = 0
    (1 to 99).foreach{(a:Int) =>
      (1 to 99).foreach{(b:Int) =>
        val p = BigInt(a).pow(b)
        val total = (0 /: p.toString())((t:Int,c:Char) =>{
          t+c.toString.toInt
        })
        if(total > maximum) maximum = total
       }
    }
    
    maximum.toString()
  }
}