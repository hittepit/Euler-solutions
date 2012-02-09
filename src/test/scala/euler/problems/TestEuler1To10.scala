package euler.problem

import org.scalatest.FunSuite

import euler.problem1.Euler1
import euler.problem2.Euler2
import euler.problem3.Euler3
import euler.problem4.Euler4
import euler.problem5.Euler5
import euler.problem6.Euler6
import euler.problem7.Euler7
import euler.problem8.Euler8
import euler.problem9.Euler9

class TestEuler1To10 extends FunSuite {  
  
  test("Euler1"){
    val cut = new Euler1
    assert("233168"==cut.execute)
  }
  
  test("Euler2"){
    val cut = new Euler2
    assert("4613732"==cut.execute)
  }
  
  test("Euler3"){
	  val cut = new Euler3
	  assert("6857"==cut.execute)
  }
  
  test("Euler4"){
	  val cut = new Euler4
	  assert("906609"==cut.execute)
  }
  
  test("Euler5"){
	  val cut = new Euler5
	  assert("232792560"==cut.execute)
  }
  
  test("Euler6"){
	  val cut = new Euler6
	  assert("25164150"==cut.execute)
  }
  
  test("Euler7"){
	  val cut = new Euler7
	  assert("104743"==cut.execute)
  }
  
  test("Euler8"){
	  val cut = new Euler8
	  assert("40824"==cut.execute)
  }
  
  test("Euler9"){
	  val cut = new Euler9
	  assert("31875000"==cut.execute)
  }
  
}