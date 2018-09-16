package scala.day06

/**
  * 这是一个逆变的例子
  */
//父类，所有的动物
class Animal{}
//子类，继承自父类
class Bird extends  Animal{}

//子类(麻雀),继承自鸟
class Sparrow extends  Bird{}

//吃东西的类
class EatSomething[-T](t:T){}

object ContravanceDemo {
  def main(args: Array[String]): Unit = {
    //创建鸟吃东西的对象
    val bird :EatSomething[Bird] = new EatSomething[Bird](new Bird)

    //创建一个麻雀吃东西的对象
    //问题：能否将bird赋值给sparrow
    val sparrow: EatSomething[Sparrow] = bird
  }

}
