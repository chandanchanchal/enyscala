object DemoRCarryingFunctionWithPartiallyApplied {
    // Curring function declaration
    def add2(a: Int) (b: Int) = a + b;

    def main(args: Array[String])
    {

      val sum=add2(29)_;          // Partially Applied function.
      println(sum(5));
    }
  }

// Function Chaining (result you get is chain of functions)
        // = Function currying (separate parameters in different brackets) +
        // partially applied function (i.e. use _)


