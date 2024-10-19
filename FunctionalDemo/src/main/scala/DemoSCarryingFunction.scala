object DemoSCarryingFunction {

  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World"



//    println("str1, str2 : " + printSomeThing(str1,str2))
    println("str1, str2 : " + printSomeThing(str1)(str2))
  }


//  def printSomeThing(str1: String, str2: String): String = {
//    str1 + " " + str2
//  }

  //  def printSomeThing(str1: String)( str2: String): String = {
  //    str1 + " " + str2
  //  }

  def printSomeThing (str1:String)=(str2:String) => str1 + " " + str2


}
