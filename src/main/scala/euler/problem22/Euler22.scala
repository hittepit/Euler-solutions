package euler{
  import utils.Files._
  
  package problem22{

	object Euler22 {
		def main(args: Array[String]) {
			val names = read("euler/problem22/names.txt")(0).replaceAll("\"","").split(",")
			val orderedNames = names.sortWith(_.compareTo(_)<0)
			val result = (0/:(1 to orderedNames.size))((total:Int,index:Int) => total+score(index,orderedNames(index-1)))
			
			println(result)
		}
		
		def score(index:Int,s:String) = {
		  val value = (0/:s)(_+_.toInt-64)
		  value*index
		}
	}
  }
}