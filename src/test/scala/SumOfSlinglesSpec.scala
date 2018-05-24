import org.scalatest.{MustMatchers, WordSpec}

class SumOfSlinglesSpec extends WordSpec with MustMatchers {

  "SumofSingles" must {

    "given list of 2 different numbers return the summed value" in {
      SumOfSingles.sum(List(1,2)) mustEqual 3
    }

    "return the values that only appear once in a short amount of numbers" in {
      SumOfSingles.sum(List(4,5,7,5,4,8)) mustEqual 15
    }

    "return the values that only appear once in a long amount of numbers" in {
      SumOfSingles.sum(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }


}
