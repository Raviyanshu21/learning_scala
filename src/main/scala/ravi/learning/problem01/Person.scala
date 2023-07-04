package ravi.learning.problem01

class Person(val name: String) {

  var age = 23

  def personProfile(): String = {
    val pp = s"The person name is $name"
    pp
  }

}
