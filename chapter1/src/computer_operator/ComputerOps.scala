package computer_operator

import org.junit.Test

class ComputerOps {
  def main(args: Array[String]): Unit = {
    val resIntersect = "Hello".intersect("World")
    println(resIntersect)
  }

  @Test
  def intersectTest() {
    println("Hello".intersect("World"))
  }


}
