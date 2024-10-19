object DemoOPartiallyAppliedFunctions {
  def main(args: Array[String]): Unit = {
    car("Mercedes")
    fourWheeler("BMW", "Car", 500000)
    truck("BMW")
  }

  val car = fourWheeler(_:String, "Car", 200000)        // partially implemented function
  val truck = fourWheeler(_:String, "Truck" , 500000)   // partially implemented function

  val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
        println("Vehicle Name is: " + vehicleName +
          ", Vehicle Type is: " + vehicleType +
          ", vehicle Cost is: " + vehicleCost)
      }
  //  def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
  //    println("Vehicle Name is: " + vehicleName +
  //      ", Vehicle Type is: " + vehicleType +
  //      ", vehicle Cost is: " + vehicleCost)
  //  }

}
