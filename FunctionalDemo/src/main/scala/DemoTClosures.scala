// Closures: Variables are defined outside function definition

object DemoTClosures {

  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }

//  def multiplier (x: Int) = {
//    x * 10
//  }
//
  var factor = 9
  var multiplier = (x:Int) => x * factor
  // if variable (eg: factor) is defined outside the function body, it is called as Closure

  // if variable used inside function body (eg factor) is niether a input parameter
  // nor defined inside function body



  // Note: Below function is not a closure, because factor1 is defined inside the function body
  var multiplier1 = (x:Int) => {
    var factor1 = 1
    x * factor1
  }

}
