package io.getquill.quat

object Test {
  case class Person(name: String, age: Int)
  def main(args: Array[String]): Unit = {
    val v = Person("Joe", 123)
    //QuatMaking.inferQuat(v) //hellooo

    
    QuatMaking.of[Person]

  }
}
