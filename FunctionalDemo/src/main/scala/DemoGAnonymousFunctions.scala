object DemoGAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listOfNumbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9)
    listOfNumbers.foreach(num =>
      if (divisibleByThree(num))
          {
            println(num + " is divisible by three")
          }
    else
          {
            println(num + " is not divisible by three")
          }
    )

    // use with Filter
    //var divisibleByThreeOutput = listOfNumbers.filter((x:Int) => x%3==0)
    //var divisibleByThreeOutput = listOfNumbers.filter(x => x%3==0)
    var divisibleByThreeOutput = listOfNumbers.filter(_%3==0)
    println(divisibleByThreeOutput)

  }

  // Traditional Way
//  def divisibleByThree (x : Int) = {
//    x%3==0
//  }

  // Anonymous function
var divisibleByThree = (x:Int) => x%3==0


}
