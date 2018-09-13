package scala.day04.array

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {

    //创建一个数组
    //ALT+ENTER
    var arr: Array[Int] = Array(1,2,3,4,5,6)

    println(s"First Element = ${arr(0)}")
    println(s"Length = ${arr.length}、Size=${arr.size}")

    //对数组中某个元素进行赋值
    arr(2) = 100
    //循环遍历数组中的元素
    arr.foreach(println)
    //数组定义的第二种方式
    val arr2 = new Array[Int](5)  //初始化数组
    //类型为Any,是所有类型的祖宗，抽象类
    val arr3: Array[Any] = Array(1,2,3,4,"Hello")
    val first = arr3(0)
   //转换为Int类型，输出
    val intValue = first.asInstanceOf[Int]
    println(intValue)
    println("**********************可变数组**************************")
    import scala.collection.mutable.ArrayBuffer
    val arrayBuffer = ArrayBuffer[Int]()
    //添加元素
    arrayBuffer += 10


    //添加一组元素，可以是List或者数组
    arrayBuffer ++= Array(1,2,3,4,5,6)
    println(arrayBuffer)

   //在实际开发中，通常将可变数组转化为不可变数组，进行操作

    val array = arrayBuffer.toArray.foreach(println)
    println(array)
   //根据值删除，如果元素存在直接remove.否则忽略（不报错）
    arrayBuffer -= 1

    //调用用mkString方法，将数组中的元素合成一个字符串。并且将各个元素之间使用指定的分隔符进行分隔
     arrayBuffer.mkString(",")
   val array1 =   arrayBuffer.mkString("<",",",">")
    println(array1)
  }

}
