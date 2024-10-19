object DemoIFunctionCallByName {

  def main(args: Array[String]): Unit = {
    printValue(increment())
    printValue(decrement())
  }

  def printValue (m: => Int) = {
    println("value is " + m)
  }

  def increment() = {
    var y = 2
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }

  def decrement() = {
    var y = 2
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}
