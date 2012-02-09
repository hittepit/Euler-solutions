package euler.problem3

import scala.math._

import euler.utils.Timer
import euler.problems.Solution
import euler.utils.Math._
/**
 * Solution 1 is the more efficient, but the less functional...
 * Method solution1, elapsed time = 8.901265 ms
 * Method solution2, elapsed time = 19.604576 ms
 * Method solution3, elapsed time = 9.259863 ms
 * Method solution4, elapsed time = 20.523711 ms
 * Method solution5, elapsed time = 10.523711 ms
 *
 * Solution 5 is acceptable
 */
object Euler3 extends Timer {
  def main(args: Array[String]) {
    val value = 600851475143L

    val sol1 = solution1(value)
    val sol2 = solution2(value)
    val sol3 = solution3(value)
    val sol4 = solution4(value)
    val sol5 = solution5(value)
    println("Solution1 = " + sol1)
    println("Solution2 = " + sol2)
    println("Solution3 = " + sol3)
    println("Solution4 = " + sol4)
    println("Solution5 = " + sol5)
  }

  def solution5(value: Long) = time("solution5") { () =>
    val max = Math.sqrt(value).longValue()

    var i = 1L
    var found = false
    var bestSolution = 0L
    while (i <= max && !found) {
      if (value % i == 0) {
        val highFactor = value / i
        if (isPrime(highFactor)) {
          bestSolution = highFactor
          found = true
        } else if (isPrime(i)) {
          bestSolution = i
        }
      }
      i += 1
    }
    bestSolution
  }

  def solution1(value: Long) = time("solution1") { () =>
    val max = Math.sqrt(value).longValue()

    var i = 1L
    var found = false
    var bestSolution = 0L
    while (i <= max && !found) {
      if (value % i == 0) {
        val highFactor = value / i
        if (isPrimeV1(highFactor)) {
          bestSolution = highFactor
          found = true
        } else if (isPrimeV1(i)) {
          bestSolution = i
        }
      }
      i += 1
    }
    bestSolution
  }

  def solution2(value: Long) = time("solution2") { () =>
    val max = Math.sqrt(value).longValue()
    val solution = ((false, 0L) /: (1L to max))((best: (Boolean, Long), i: Long) =>
      if (best._1)
        best
      else if (value % i == 0) {
        val highFactor = value / i
        if (isPrimeV1(highFactor)) {
          (true, highFactor)
        } else if (isPrimeV1(i)) {
          (false, i)
        } else {
          best
        }
      } else {
        best
      })
    solution._2
  }

  def solution3(value: Long) = time("solution3") { () =>
    val max = Math.sqrt(value).longValue()

    var i = 1L
    var found = false
    var bestSolution = 0L
    while (i <= max && !found) {
      if (value % i == 0) {
        val highFactor = value / i
        if (isPrimeV2(highFactor)) {
          bestSolution = highFactor
          found = true
        } else if (isPrimeV2(i)) {
          bestSolution = i
        }
      }
      i += 1
    }
    bestSolution
  }

  def solution4(value: Long) = time("solution4") { () =>
    val max = Math.sqrt(value).longValue()
    val solution = ((false, 0L) /: (1L to max))((best: (Boolean, Long), i: Long) =>
      if (best._1)
        best
      else if (value % i == 0) {
        val highFactor = value / i
        if (isPrimeV2(highFactor)) {
          (true, highFactor)
        } else if (isPrimeV2(i)) {
          (false, i)
        } else {
          best
        }
      } else {
        best
      })
    solution._2
  }
	def isPrimeV1(value:Long) = {
	  val max = sqrt(value).longValue()
	  var i = 2L
	  var prime = true
	  while(i<=max && prime){
	    prime=value%i!=0
	    i+=1
	  }

	  prime
	}
	
	def isPrimeV2(value:Long) = value!=1 && ! (2L to sqrt(value).longValue()).exists(value%_==0)

}

class Euler3 extends Solution {
  val value = 600851475143L
  def execute = solution(value).toString

  def solution(value: Long) = {
    val max = Math.sqrt(value).longValue()

    var i = 1L
    var found = false
    var bestSolution = 0L
    while (i <= max && !found) {
      if (value % i == 0) {
        val highFactor = value / i
        if (isPrime(highFactor)) {
          bestSolution = highFactor
          found = true
        } else if (isPrime(i)) {
          bestSolution = i
        }
      }
      i += 1
    }
    bestSolution
  }
}
