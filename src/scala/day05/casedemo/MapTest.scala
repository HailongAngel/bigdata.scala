package scala.day05.casedemo

/**
  * 模式匹配
  * 有对象就是Some
  * 无对象就是None
  *
  */
object MapTest {
  def main(args: Array[String]): Unit = {
    //Some None
    //Some代表有（多例），样例类
    //None代表没有（单例），样例对象
    //Option是Some和None的父类
    val mp = Map("a" -> 1, "b" -> 2, "c" -> 3)
   /* val r: Int = mp("a")
    println(r)*/
    val r: Option[Int] = mp.get("d")
    println(r)
    //val r1 = r.get
    //println(r)
   /* val r = mp.getOrElse("d", -1)
    println(r)*/
  }
}
