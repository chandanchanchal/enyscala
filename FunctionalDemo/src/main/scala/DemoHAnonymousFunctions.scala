object DemoHAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var listOfNumbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9)
    // use with Map
    var squareOfNumbers = listOfNumbers.map(square)
    println(squareOfNumbers)

//    var squareOfNumbersAAA = listOfNumbers.map((x: Int) => x * x)
    var squareOfNumbersAAA = listOfNumbers.map(x => x * x)
//    var squareOfNumbersAAA = listOfNumbers.map(_ * _) // NOTE: THIS WILL NOT WORK, BECAUSE TWO "_"
    // EXPECTS TWO INPUT HOWEVER map ONLY PROVIDES 1 INPUT. i.e. map PROVIDES ONE NUMBER AT A GIVEN TIME
    println(squareOfNumbersAAA)

//    var doubleOfNumbers = listOfNumbers.map((x: Int) => x * 2)
//    var doubleOfNumbers = listOfNumbers.map(x => x * 2)
    var doubleOfNumbers = listOfNumbers.map(_ * 2)
    println(doubleOfNumbers)
  }

  // Traditional Way
//  def square(x: Int): Int = {
//    x * x
//  }

// Function Variable
  var square:Int=>Int = (x: Int) => x * x

  var a:Int = 3

}
