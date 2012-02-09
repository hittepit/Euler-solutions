package euler.problems
import org.scalatest.FunSuite
import euler.problem45.Euler45
import euler.problem44.Euler44
import euler.problem43.Euler43

class TestEuler41To50 extends FunSuite {
  test("Euler43"){
    val cut = new Euler43
    assert("16695334890"==cut.execute)
  }
  
  test("Euler44"){
    val cut = new Euler44
    assert("5482660"==cut.execute)
  }
  
  test("Euler45"){
    val cut = new Euler45
    assert("1533776805"==cut.execute)
  }

}