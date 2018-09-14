package scala.day04.polym
<<<<<<< HEAD
/*（*）多态
1）什么是多态：目的是为了让代码更加，降低耦合
有继承或实现特质（接口）
父类引用指向子类对象或接口指向实现类
方法需要重写*/
=======
（*）多态
1）什么是多态：目的是为了让代码更加，降低耦合
有继承或实现特质（接口）
父类引用指向子类对象或接口指向实现类
方法需要重写
>>>>>>> 991b6c34f4e49f111bcf51620414e6a9beb4bb1d

abstract class Element {
  def demo(): Unit ={
    println("Element's invoked")
  }
}
class ArrayElement extends Element{
  override def demo(): Unit = {
    println("ArrayElement's invoked")
  }
}
class LineElement extends ArrayElement{
  override def demo(): Unit = {
    println("LineElement's invoked")
  }
}
class  UniforElement extends  Element //没有重写父类方法

object ElementTest{
  //参数类型为祖宗类，任何子类实例都可以传递（基类）
  def invokedDemo(e:Element): Unit ={
    e.demo()  //多态，在运行时调用相应子类方法
  }
  def main(args: Array[String]): Unit = {
    invokedDemo(new ArrayElement) //父类引用指向子类对象
    invokedDemo(new LineElement) //祖父类引用指向孙类对象
    invokedDemo(new UniforElement) //没有重写父类方法，所以调用的时候输出祖宗类demo
  }
}
