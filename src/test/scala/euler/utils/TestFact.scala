package euler.utils

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class TestFact extends FunSuite with ShouldMatchers{

  import Math.fact
  
  test("0! == 1"){
    fact(0) should equal(1)
  }
  
  test("1! == 1"){
    fact(1) should equal(1)
  }
  
  test("5! == 120"){
    fact(5) should equal(120)
  }
  
  test("100! == very big number"){
    fact(100) should equal(BigInt("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"))
  }
}