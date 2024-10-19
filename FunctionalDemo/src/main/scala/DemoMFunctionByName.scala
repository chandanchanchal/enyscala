object DemoMFunctionByName {
  def main(args: Array[String]): Unit = {
    println("Main Function: " + exec(time()))
  }

  def time() : Long = {
    println("Inside time function")
    return System.nanoTime()
  }

  def exec(t: => Long) : Long = {
    println("Entering exec function")
    println("Time: " + t)
    println("Exiting from exec function")
    return t
  }
}
// Points to remember
//1. It will first execute the OUTSIDE function "exec()" and then execute the INSIDE
// function "time()" every time t is being referred.
//2. Since OUTSIDE function "exec()" got executed first, it calls INSIDE function "time()"
// using the REFERENCED VATIABLE t, it is called as "Function by Name"