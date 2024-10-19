object DemoQNestedFunction {

  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("India")
  }

  def printHello(str: String): Unit ={

    def printSomeThing(str1: String, str2: String): Unit = {
      print(str1 + " " + str2)
    }

    printSomeThing("Hello", str)
  }

}
