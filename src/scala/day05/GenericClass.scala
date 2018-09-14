package scala.day05
/*
泛型类
 */
class GenericClass1 {
  private var content:Int = 100

  //定义set和get方法
  def setContent(value:Int): Unit ={
    content = value
  }

  def getContent():Int= {
    content
  }
}
class GenericClass2{
  private var content:String = "abc"

  //定义set和get方法
  def setContent(value:String): Unit ={
    content = value
  }

  def getContent():String= {
    content
  }
}

/**
  * 定义一个泛型类
  * @tparam T
  */
class GenericClass[T] {
  private var content: T = _

  //定义set和get方法
  def setContent(value: T): Unit = {
    content = value
  }

  def getContent(): T = {
    content
  }
}
object GenericClassTest{
  def main(args: Array[String]): Unit = {
    val intObj = new GenericClass1
    intObj.setContent(1234)
    intObj.getContent()

    val strObj = new GenericClass2
    strObj.setContent("abc")
    strObj.getContent()

    val genObj = new GenericClass[String]
    genObj.setContent("abc")
    println(genObj.getContent())

    val genObj2 = new GenericClass[Int]
    genObj2.setContent(123)
    println(genObj2.getContent())

    val genObj3 = new GenericClass[Double]
    genObj3.setContent(12.3)
    println(genObj3.getContent())
  }
}