package euler.problem8

import euler.utils.Files.read

object Euler8 {
       def main(args: Array[String]) {
    	   val s = read("euler/problem8/data.txt")
             println(solve(s(0)))
       }
       
       def solve(s:String) = {
         var maxProd = 0
         for(i <- 0 to 995) {
        	 val c =s(i)
             val prod = s(i).toString.toInt*s(i+1).toString.toInt*s(i+2).toString.toInt*s(i+3).toString.toInt*s(i+4).toString.toInt
             if(prod>maxProd) maxProd=prod
         }
         maxProd
       }
}

class Euler8 {
       def execute = {
    	   val s = read("euler/problem8/data.txt")
             solve(s(0)).toString
       }
       
       def solve(s:String) = {
         var maxProd = 0
         for(i <- 0 to 995) {
        	 val c =s(i)
             val prod = s(i).toString.toInt*s(i+1).toString.toInt*s(i+2).toString.toInt*s(i+3).toString.toInt*s(i+4).toString.toInt
             if(prod>maxProd) maxProd=prod
         }
         maxProd
       }
}