// Even Number or Odd Number
// print Event or Print Odd

object DemoUClosures {

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEven,2))
    println(evenOrOdd(isEven,3))
    println(evenOrOdd(isEven,4))
    println(evenOrOdd(isEven,5))
    println(evenOrOdd(isEven,6))
  }

  def evenOrOdd(f:Int=>Boolean, x: Int): String ={
    var evenFlag = f(x)
    if (evenFlag)
    {
      "Even Number"
    }
    else
    {
      "Odd Number"
    }
  }

//  def isEven (x: Int): Boolean ={ //Traditional Function Definition
//    x%2==0
//  }
  var div = 2
  var isEven = (x:Int) => x%div==0

//  val isEven: (Int) => Boolean = (x) => { x%2==0 } // If you want to specify return type

}
