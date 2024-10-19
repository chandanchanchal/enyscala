object DemoLFunctionByValue {
  def main(args: Array[String]): Unit = {
    println("Main Function: " + exec(time()))
  }

  def time() : Long = {
    println("Inside time function")
    return System.nanoTime()
  }

  def exec(i:Long) : Long = {
    println("Entering exec function")
    println("Time: " + i)
    println("Exiting from exec function")
    return i
  }
}
// Points to remember
//1. It will first execute the inside function "time()" and then execute the outside
// function "exec(140698097570299)"
//2. Since inside function "time()" got executed first, it calls outside function "exec(140698097570299)"
// using the value 140698097570299, it is called as "Function by Value"
