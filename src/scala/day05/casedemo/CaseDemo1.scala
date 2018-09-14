package scala.day05.casedemo

import scala.util.Random

/**
  * 匹配字符串，匹配内容
  */
object CaseDemo1 extends  App{
  val arr = Array("tom","mike","hello")
  val i = Random.nextInt(arr.length)
  println(i)
  val name = arr(i)
  println(name)

  //这里的=>不是函数，在这里表示模式匹配，如果匹配的上执行这里的逻辑
  //类比法 JAVA: switch case
  name match{
    case "tom" => println("我是tom...")
    case "mike" =>{
      println("我是mike")
    }
    case  _ => println("真不知道你们在说什么。。。")

  }


}
