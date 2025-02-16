object HigherOrderFunctionReturning {
  
  def multiplier(factor: Int): Int => Int = {
    (x: Int) => x * factor 
  }

  def main(args: Array[String]): Unit = {
    val triple = multiplier(3) 
    val result = triple(4) 
    println(s"Triple of 4 is: $result") 
  }
}
