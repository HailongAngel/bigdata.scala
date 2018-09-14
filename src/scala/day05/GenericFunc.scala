package scala.day05

import scala.reflect.ClassTag

/**
  * 泛型函数
  * Created by zhangjingcun on 2018/9/14 14:47.
  */
object GenericFunc {

  /**
    * 定义函数，创建一个int类型的数组
    * @param elem
    * @return
    */
  def mkIntArray(elem: Int*) = Array[Int](elem: _*)

  /**
    * 定义函数：创建一个String类型的函数
    * @param elem
    * @return
    */
  def mkStringArray(elem:String*) =Array[String](elem:_*)

  /**
    * 在函数中使用泛型，取代上面的两个函数
    * @param elem
    * @tparam T
    * @return
    */
  def mkArray[T:ClassTag](elem:T*) = Array[T](elem:_*)

  /**
    * 定义泛型函数
    * @param name
    * @param age
    * @tparam T1
    * @tparam T2
    * @tparam T3
    * @return
    */
  def say[T1, T2, T3](name:T1, age:T2):T3 = {
    (s"name:${name}, age:${age}").asInstanceOf[T3]
  }
  def main(args: Array[String]): Unit = {
    println(mkIntArray(1, 2, 3, 4, 5).toBuffer)

    println(mkStringArray("a", "b", "c").toBuffer)

    println("*****************调用泛型函数**************************************")
    println(mkArray(1, 2, 3, 4, 5).toBuffer)

    println(mkArray("a", "b", "c").toBuffer)

    println("*****************调用泛型函数2**************************************")
    println(say[String,Int,String]("Tom", 23))
    println(say("Mike", 23)) //scala会自动推断泛型的实际类型
  }
}
