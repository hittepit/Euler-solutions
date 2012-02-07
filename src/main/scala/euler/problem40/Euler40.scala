package euler.problem40

import scala.math._

import scala.collection.immutable._

object Euler40 {
  def main(args: Array[String]) {
    var index = 1
    var result = 1
    var number = 1
    val values = List(1,10,100,1000,10000,100000,1000000)
    values.foreach{(value:Int) =>
      var found = false
      while(!found){
        if(index>=value){
          found = true
          val n = number.toString().charAt(index-value).toString().toInt
          result*=n
        }
        index+=number.toString().length()
        number+=1
      }
    }
    
    println(result)
  }
}