val myList = List(1,2,3,4,5,1,2,3)

//val listDistinct = myList.distinct

val repeatedNumbers = myList diff myList.distinct

val nonRepeatedNumbers = myList.distinct diff repeatedNumbers

myList.distinct.diff(repeatedNumbers)

val repeatNums = myList.diff(myList.distinct)

val distinctive = myList.filterNot(x => repeatNums.contains(x))

distinctive.sum

