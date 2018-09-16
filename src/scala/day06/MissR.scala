package scala.day06

/**
  * 使用柯里化实现隐式转换
  *
  */
class  Girl(val name:String,var  faceValue:Int)
object  MyPreDef{
  implicit object GirltoOrding extends Ordering[Girl]{
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }
}
class MissR [T]{
  /**
    * 如何使用柯里化传入一个隐式转换函数，作用和ViewBound是一样的，都需要一个隐式转换方法或者函数
    * 核心：使用柯里化的方式实现了类似视图界定的功能
    *   解析：
    *     (implicit ord: T => Ordered[T]) 是一个函数
    *     实现了Ordered特质
    *   调用：
    *     val g = mr.choose(g1, g2)
    *
    *
    */
  def choose(first:T,second:T)(implicit  ord: T => Ordered[T]):T = {
    if (first > second) first else second
  }
}
object MissR{
  def main(args: Array[String]): Unit = {

    val mr = new MissR[Girl]
    val g1 = new Girl("mike" ,90)
    val g2 = new Girl("mary",92)

    val g = mr.choose(g1,g2)
    println(g.name)
  }
}
