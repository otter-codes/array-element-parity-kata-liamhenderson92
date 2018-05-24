import org.scalatest._

class ArrayParitySpec extends WordSpec with MustMatchers {

  "ArrayParity" must {

    "when given a list of 0 return 0" in {
      ArrayParity.parity(List(1)) mustEqual 1
    }

    "when given a list of -1,1,2 return 2" in {
      ArrayParity.parity(List(-1,1,2)) mustEqual 2
    }

    "when given a list of -3,1,2,3,-1,-4-2 return -4" in {
      ArrayParity.parity(List(-3,1,2,3,-1,-4-2)) mustEqual -4
    }

    "when given a list of 1,-1,2,-2,3,3" in {
      ArrayParity.parity(List(1,-1,2,-2,3,3)) mustEqual 3

    }

    "when given a list of 1,-1,2,-2,-3,-3" in {
      ArrayParity.parity(List(1,-1,2,-2,-3,-3)) mustEqual -3

    }

  }

}
