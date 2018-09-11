package scala.day02.function

object FuncDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6,7,8,9,10)
    println("*****************************基础写法（取2的余数）*****************************")
    val arr2 = for (i <- arr if i%2 == 0 ) yield  i
    println(arr2.toBuffer)
    println("*****************************函数式写法（取2的余数）*****************************")
    val func = (x:Int) => x%2 == 0
    val arr3 = arr.filter(func)
    println(arr3.toBuffer)
    println("*****************************匿名函数式写法（取2的余数）*****************************")
    val arr4 = arr.filter((x:Int) => x%2==0)
    println(arr4.toBuffer)
    println("*****************************更简单的函数式写法（取2的余数）*****************************")
    var arr5 = arr.filter(_%2 == 0)
    println(arr5.toBuffer)
  }
}
