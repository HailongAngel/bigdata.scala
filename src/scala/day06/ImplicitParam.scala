package scala.day06

/**
  * 隐式参数
  * 柯里化方法
  * implicit 关键字表示隐式的，用implicit关键字修饰的变量叫隐式变量
  * 用implicit修饰的方法叫隐式方法
  * 步骤解析：
  *   1：方法在执行时，发现需要一个隐式的int（implicit i:Int）类型参数，就会在方法执行的环境中（context）中跟
  *   2：方法中依赖的隐式变量类型一致的参数，如果有就使用
  *       implicit val xxx = 777
  *   3：如果没有就使用默认值
  *       def test()(implicit i:Int = 200) = {
  *   4：如果没有默认值，就报错
  *       def test()(implicit i:Int) = {
  *   优先级： 传入-》上下文中类型一直的隐式值-》默认值
  *   注意：
  *     implicit val abc = 888
  *     使用多个隐式变量会报错
  *
  */
object ImplicitParam {
implicit  val xxx = 777

  def  test(implicit i:Int = 100) = {
    println(i)
  }

  def main(args: Array[String]): Unit = {
    test
  }
}
