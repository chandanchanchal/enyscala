object DemoJFunctionCallByName {

  def main(args: Array[String]): Unit = {
    printValue(increment, 2)
    printValue(decrement, 2)
  }

  def printValue (m: (Int) => Int, x: Int) = {
    println("value is " + m(x))
  }

  def increment(y: Int) = {
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
  }

  def decrement(y: Int) = {
    println("Value of y is " + y)
    var z = y - 1
    println("Value of y after decrementing is " + z)
    z
  }
}
