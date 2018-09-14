package scala.day05.casedemo

/**
  * 匹配数据类型
  */
object CaseDemo02 extends App {
  //定义一个数组
  val arr:Array[Any] = Array("hello123",1,-2.0,2.0,CaseDemo02,2L)

  //取出一个元素
  val elem = arr(4)
  println(elem)

  //这里的=>不是函数，在这里表示模式匹配，如果匹配的上则执行这里的逻辑
  elem match  {
    case x:Int => println("Int " + x)
    case y:Double if (y<=0) => println("Double " + y)
    case z:String => println("String" + z)
    case w:Long => println("Long " + w)
    case CaseDemo02 => {
      val c = CaseDemo02
      println(c)
      println("case demo 2")

    }
    case _ =>{ //表示什么都没匹配上，相当于switch中的default
      println("no")
      println("default")

    }
  }
}
