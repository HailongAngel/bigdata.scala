package scala.day01.loop

object IfDemo1 {
  val x = 1
  def main(args: Array[String]): Unit = {
    //声明一个变量
    val x = 1
  println("********************* 简单写法 ******************************")
  /**
    * 简单写法
    */
  //判断x的值，将结果返回给y
  //1：可以将条件表达式直接赋值给变量
  //2：不需要return，最后一行数据即返回值
  val y =
  if (x > 0) {
    1
  } else {
    -1
  }

  println(y)

  println("********************* 混合类型的表达式 ******************************")
  /**
    * 混合类型的表达式
    */
  val z = if(x>1) "success" else "error"

  //打印z的值
  println(z)

  println("********************* 缺失else ******************************")
  //如果缺失else，相当于 if(x>1) 1 else {}
  val m = if(x>2) 1
  println(m)

  println("********************* if...else if ...else ******************************")
  val k = if(x < 0) 0
  else if(x >= 1) 1 else -1

  println(k)


}
}
