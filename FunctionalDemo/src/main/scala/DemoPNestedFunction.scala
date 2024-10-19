object DemoPNestedFunction {

  def main(args: Array[String]): Unit = {

    def printHello(msg: String): Unit = {
      println("Hello " + msg)
    }

//    val printHello = (msg: String) => println("Hello " + msg)

    printHello("World")
    printHello("India")
  }
}
