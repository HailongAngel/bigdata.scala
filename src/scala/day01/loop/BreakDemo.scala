package scala.day01.loop

object BreakDemo {
  var numbers = List(1,2,3,4,5,6,7,8,9)
  def main(args: Array[String]): Unit = {
    println("第一种循环")
    var flag = true
    for (item <- numbers if flag == true) {
      println(s"Value of is: ${item}")
      if (item == 5) {
        flag = false
      }
    }
    println("第二种循环")
    import scala.util.control.Breaks._
    breakable(
      for (item <- numbers){
        println(s"Value of is : ${item}")
        if(item == 5){
          break
        }
      }

    )

  }

}
