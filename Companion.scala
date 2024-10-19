// Companion Class
class Person(val name: String, val age: Int) {
  // Instance-level method
  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old.")
  }
}

// Companion Object
object Person {
  // apply method that acts as a factory method to create Person instances
  def apply(name: String, age: Int): Person = {
    println("apply() method is called")
    new Person(name, age)  // This creates a new Person instance
  }
}

// Usage
object Main extends App {
  // This is equivalent to calling Person.apply("Alice", 30)
  val person1 = Person("Alice", 30)

  // Another instance creation using apply method
  val person2 = Person.apply("Bob", 25)

  // Call instance methods on the created objects
  person1.greet()
  person2.greet()
}
