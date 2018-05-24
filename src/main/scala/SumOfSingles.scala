object SumOfSingles {

  def sum(input : List[Int]) : Int = {


    val distinct = input.distinct
    val repeatedNums = input diff distinct
    val nonRepeatedNums = distinct diff repeatedNums
    nonRepeatedNums.sum
  }

}
