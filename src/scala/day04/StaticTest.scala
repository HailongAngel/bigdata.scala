package scala.day04

/**
  * 实现一个单例模式
  *  实现一个单例模式
  * 构造函数被我们定义为private的目的：防止直接调用该类来创建对象
  */
class StaticTest private{//定义为private只可以创建一个对象
  private def add(x:Int,y:Int):Int = {
    return x+y
  }

}
object  StaticTest{
  //静态方法，只加载一次，所以只创建一次实例对象
  val staticTest = new StaticTest
  def add(x:Int,y:Int):Int = {
    return  staticTest.add(x,y)
  }
}
object StaticTest2{
  def main(args: Array[String]): Unit = {
    //static在scala里面不是关键字
    val static = StaticTest
    println(static.add(2,3))
  }
}