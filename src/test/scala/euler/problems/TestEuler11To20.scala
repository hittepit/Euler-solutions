package euler.problems
import org.scalatest.FunSuite
import euler.problem12.Euler12

class TestEuler11To20 extends FunSuite{
  test("Euler12"){
    val cut = new Euler12
    assert("76576500"==cut.execute)
  }

}