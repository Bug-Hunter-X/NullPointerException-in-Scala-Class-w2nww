```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(Option(name).getOrElse("Name not provided"))
  }
}

object Main extends App {
  val myObject = new MyClass(null)
  myObject.printName()  // Outputs: Name not provided
  val myObject2 = new MyClass("My Name")
  myObject2.printName() // Outputs: My Name
}
```