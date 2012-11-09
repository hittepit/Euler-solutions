package euler.problem59

import euler.utils.Files._


object Euler59 {
	def main(args: Array[String]) {
		new Euler59().execute
	}
}

class Euler59 {
  var candidates:List[String] = Nil
  
  val cipher = {
    val s = read("euler/problem59/cipher1.txt")(0).split(",")
    val z = Array.fill(s.length%3)(" ")
    Array.concat(s,Array("79","79"))
  }
  
  def execute={
	for(a <- letter('a'); b <- letter('a');c <- letter('a')){
	  val s = decrypt(""+a+b+c).dropRight(2)
	  if(s.contains("Gospel")){
	    println(s)
	    println((0/:s)(_+_))
	  }
	}
  }
  
  def decrypt(key:String) = (""/:cipher.grouped(3).map({s:Array[String] => (""+(s(0).toInt^key(0)).toChar)+(s(1).toInt^key(1)).toChar+(s(2).toInt^key(2)).toChar}))(_+_) 
  
  def letter(start:Char):Stream[Char] = start #:: (if(start!='z') letter((start.toInt+1).toChar) else Stream.Empty)
}