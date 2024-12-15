```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(name)
  }
}

object Main extends App {
  val myObject = new MyClass("My Name")
  myObject.printName()
}
```