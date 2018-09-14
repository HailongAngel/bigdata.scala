package scala.day05

/*
隐式转换函数
 */

/**
  * 定义一个水果类
  * @param name
  */
class Fruit(name:String){
  def getName() ={
    name
  }
}

/**
  * 猴子类，喜欢吃水果
  * @param f
  */
class Monkey(f:Fruit){
  def say() = println(s"Monkey like ${f.getName()}")
}

object ImplicitDemo {

  /**
    * 定义一个转换规则（隐式转换函数），把Fruit转换成Monkey
    * @param f
    * @return
    */
  implicit  def Fruit2Monkey(f:Fruit):Monkey = {
    new Monkey(f)
  }
  def main(args: Array[String]): Unit = {
    //定义一个水果对象
    val f: Fruit = new Fruit("桃子") //调用这个函数
    f.say()
  }
}