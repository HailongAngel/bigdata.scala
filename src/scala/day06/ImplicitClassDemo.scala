package scala.day06

/**
  * 隐式转换类
  */
object ImplicitClassDemo {

  //实现计算功能
  implicit  class  Cala(x:Int){
    def  add (y:Int) = x + y
  }

  def main(args: Array[String]): Unit = {
    //实现两个数字的相加
    /**
      * 调用过程：
      *   1：调用1的add函数，但是没有发现add函数
      *   2：查找一个能否接受int类型的隐式类，->  implicit class Cala(x:Int) {
      *   3：把1传递给Cala对象，构造一个Cala对象
      *   4：再调用Cala对象的add函数
      */
    println("两个数字的和："+ 1.add(4))
    println("两个数字的和："+Cala(7).add(4))
  }
}
