package main.scala.day06.demo1

/**
  * 这是一个协变的例子
  * 语法：+T
  * Created by zhangjingcun on 2018/9/15 8:29.
  */
/**
  * 动物类，父类：所有的动物
  */
class Animal{ }

/**
  * 子类，继承自父类
  */
class Bird extends Animal {}

/**
  * 动作，吃东西的类
  * @param t
  * @tparam T
  */
class EatSomething[+T](t:T)

object CovarianceDamo {

  def main(args: Array[String]): Unit = {
    //创建一个bird吃东西的类
    val bird: EatSomething[Bird] = new EatSomething[Bird](new Bird)

    //创建一个动物吃东西的类
    //问题：能否将bird赋值给animal
    //原因：尽管Bird是Animal的子类，但是EatSomething[Bird]不是EatSomething[Animal]的子类，两者之间不具备继承关系
    //解决：使用协变，class EatSomething[+T](t:T)(), 可以认为EatSomething[Bird]是EatSomething[Animal]的子类
    val animal: EatSomething[Animal] = bird
  }
}
