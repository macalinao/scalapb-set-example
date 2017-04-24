package pw.ian.example

import my_proto._

object ScalaPBSetExample {

  def main(args: Array[String]): Unit = {
    val msg = MyMessage(
      numbers = Set(1, 2, 3, 4, 5),
    )
    msg.toByteArray  // throws exception
  }

}
