// Program 2: Singleton object
object DemoObjectB{ //1st Note: Instead of class, this is object
  val x = 2
  val y = 5.5

  def addValue() =  x + y

  println(s"x = ${x} , y = ${y}")
}

object SingletonDemoA {
  def main(args: Array[String]): Unit = {

//    val demoObjectB1 = new DemoObjectB //2nd Note: IF you uncomment it, it will give error, as can not create object from a object
    println(DemoObjectB.x, DemoObjectB.y) //3rd Note: Access variable as objectName.variableName

    val a = DemoObjectB.addValue() //4th Note: Access method/function as objectName.method
    println(a)
  }
}