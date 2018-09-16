package scala.day05.casedemo

object PartialFuncDemo {
  /**
    * 偏函数
    * 传一个参数，返回一个参数，省略match
    */
def fun1: PartialFunction[String,Int] = {
  case "one" => {
    println("one case")
    1
  }
  case "tow" => 2
  case  _ => -1
}
  def  fun2(num:String):Int = num match {
    case "one" => 1
    case "two" => {
      2
    }
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(fun1.apply("two"))
    println(fun2("two"))
  }
}
