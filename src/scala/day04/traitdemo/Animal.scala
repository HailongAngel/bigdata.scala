package scala.day04.traitdemo

abstract class Animal{//定义一个抽象类用于继承
  //抽象方法，必须实现
  def color()
  //非抽象方法，有具体的实现
  def  eat() = {
    println("吃东西")
  }
  final  def action ():Unit = {
    println("奔跑")
  }

}
