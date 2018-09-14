package scala.day05.casedemo

object OptionDemo {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1,"b" ->2,"c"->5)
    val r = map.getOrElse("a",0)
    val o = map.get("c")

    //println(o)
    val v = o match {
      case  Some(i) => {
        i
      }
      case  None =>{
        0
      }
    }
    println(v)
    val v1 = map.getOrElse("c",-1)
  }
}
