import org.scalatest._

class CountOddSpec extends WordSpec with MustMatchers {

  "CountOdd" must {

    "return 0 when given 1" in {
      CountOdd(1) mustEqual 0
    }

    "return 1 when given 2" in {
      CountOdd(2) mustEqual 1
    }

    "return 3 when given 7" in {
      CountOdd(7) mustEqual 3
    }

    "return 4 when given 8" in {
      CountOdd(8) mustEqual 4
    }
  }

}
