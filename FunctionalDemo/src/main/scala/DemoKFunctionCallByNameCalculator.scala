
object DemoKFunctionCallByNameCalculator {

  def main(args: Array[String]): Unit = {
    println("Addition of 5 and 2 is " + calculator(add, 5,2))
    println("Subtraction of 5 and 2 is " + calculator(sub, 5,2))
    println("Multiplication of 5 and 2 is " + calculator(mul, 5,2))
    println("Quotient of Division of 5 and 2 is " + calculator(div, 5,2))
    println("Reminder of Division of 5 and 2 is " + calculator(rem, 5,2))
  }

  def calculator (m: (Int, Int) => Int, x: Int, y:Int): Int = {
    m(x,y)
  }

//  def add(x:Int, y: Int) = {
//    x+y
//  }

  var add = (x:Int, y: Int) => x + y
  var sub = (x:Int, y: Int) => x - y
  var mul = (x:Int, y: Int) => x * y
  var div = (x:Int, y: Int) => x / y
  var rem = (x:Int, y: Int) => x % y

}
