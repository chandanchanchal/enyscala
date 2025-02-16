object HigherOrderFunctionExample {
  
  def applyFunction(f: Int => Int, x: Int): Int = {
    f(x) 
  }

  
  def double(n: Int): Int = n * 2

  def main(args: Array[String]): Unit = {
    val result = applyFunction(double, 5) 
    println(s"Result: $result") 
  }
}

