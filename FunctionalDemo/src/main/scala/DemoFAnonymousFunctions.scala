// Anonymous Functions
// Function without a name and def keyword.
// First Class Function... Pass Function as parameter and define function values

object DemoFAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    println("Increment Function output is " + increments(5))
    printHelloWorld()
    println("Add function output is " + add(2,3))
  }

  // Example 1: Anonymous Function with 1 input parameter and 1 output parameter
  // Normal Way of defining an increments function
//  def increments (x: Int) : Int = {
//    x + 1
//  }

  // Using function value / Anonymous functions
  var increments = (x: Int) => x + 1

  // Example 2: Anonymous Function with 0 input parameter and 0 output parameter
  // Normal way of defining function
//  def printHelloWorld () = {
//    println("Hello World!")
//  }

  // Using function value / Anonymous functions
  var printHelloWorld = () => println("Hello World")

  // Example 3: Anonymous Function with 2 input parameter and 1 output parameter
  // Normal Way of defining an increments function
//    def add (x: Int, y: Int) : Int = {
//      x + y
//    }

  // Using function value / Anonymous functions
  var add = (x:Int, y:Int) => x + y

}
