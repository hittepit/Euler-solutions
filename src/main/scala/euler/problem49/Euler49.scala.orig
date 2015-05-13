package euler.problem49

import scala.math._
import euler.utils.Math._
import java.util.TreeSet

object Euler49 {
	def main(args: Array[String]) {
		println(new Euler49().execute)
	}
}

class Euler49{
  
  def execute = {
    var solutions = new TreeSet[String]()
    (1111 to 9999).foreach{(i:Int) => 
    val gaps = scala.collection.mutable.Map[Int,Gap]()
      var numberOfPrimes = 0
      for(n1 <- i.toString.permutations;n2 <- i.toString.permutations){
        val gap = abs(n1.toInt-n2.toInt)
        if(gap!=0){
	        if(! gaps.contains(gap)) gaps+=(gap -> Gap(n1.toInt,n2.toInt))
        }
      }

      gaps.foreach{(el:(Int,Gap)) =>
          val n1 = el._2.n1
          val n2 = el._2.n2
          val n3 = n2+el._1
        if(i.toString.permutations.contains(n3.toString()) && isPrime(n1) && isPrime(n2) && isPrime(n3)){
          val s = n1.toString+n2+n3
          if(n1!=1487 && s.length==12){
            solutions.add(s)
          }
        }
      }

    }
    
    solutions.first
  }
}

class Gap(val n1:Int,val n2:Int){
  override def equals(o:Any) = o match {
    case g:Gap => g.n1==n1 && g.n2==n2
    case _ => false
  }
  
  override def hashCode = n1*17+n2
  
  override def toString = "Gap("+n1+","+n2+")"
}

object Gap{
  def apply(n1:Int,n2:Int) = if(n1>n2) new Gap(n2,n1) else new Gap(n1,n2)
}