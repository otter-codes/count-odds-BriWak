import org.scalatest._

class CountOddSpec extends WordSpec with MustMatchers {

  "CountOdd" must {

    "return 0 when given 1" in {
      CountOdd(1) mustEqual 0
    }


  }

}
