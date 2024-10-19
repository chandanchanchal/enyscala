// Default Parameter Value

object DemoDDefaultParameter {
  def div (x: Int  = 5, y:Int = 1) : Double = {
    println("value of x is :" + x)
    println("value of y is :" + y)
    return(x / y.toDouble)
  }

  def main(args: Array[String]): Unit = {

    println(div(5,3))

    println(div(2,0))

    println(div(2))

    println(div(y = 2))

  }

}
