package scala.day04.List

/**
  * Map使用
  * Created by zhangjingcun on 2018/9/13 15:58.
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的Map
    val map = Map("Hadoop" -> 1, "Spark"->2)
    println(map.mkString(";"))

    /**
      * Map中元素类型都是二元组
      */
    val map2 = Map(("Hadoop", 1), ("Spark",2))
    println(map2.mkString(";"))

    println("*****************************如何获取元素的值*************************************")
    println("*****************************方式一*************************************")
    /**
      * 如何获取元素的值
      */
    //方式一：
    println(s"Hadoop:${map2("Hadoop")}， Spark:${map2("Spark")}")

    println("*****************************方式二*************************************")
    //方式二：
    println(s"Spark:${map2.get("Spark").get}")

    println("*****************************方式三*************************************")
    //方式三：
    println(s"Hive: ${map2.getOrElse("Hive", 0)}")

    //遍历Map中的元素
    println("*****************************遍历Map中的元素*************************************")
    println("*****************************方式一*************************************")
    for((key, value) <- map2){
      println(s"key:${key}, value:${value}")
    }

    println("*****************************方式二*************************************")
    map2.foreach(tuple => println(s"key:${tuple._1}, value:${tuple._2}"))

    println("*****************************方式三*************************************")
    for ((_, value) <- map2) println(s"value：${value}")

  }


/*


		2）Map
			#不可变集合Map
			scala> val mp = Map("a"->1, "b"->2)
			mp: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2)

			#导入所有的可变集合包，这里使用的下滑线，
			#下划线可以代表通配符
			scala> import scala.collection.mutable._
			import scala.collection.mutable._

			#可变集合Map
			scala> val mp = Map("a"->1, "b"->2)
			mp: scala.collection.mutable.Map[String,Int] = Map(b -> 2, a -> 1)

			#增加keyvalue，长度是可变的
			scala> mp.put("c", 3)
			res14: Option[Int] = None

			scala> mp
			res15: scala.collection.mutable.Map[String,Int] = Map(b -> 2, a -> 1, c -> 3)

			#修改mp的内容，内容也是可变的
			scala> mp("c") = 4

			#加一个对偶元组，可以("d"->5)这样写
			scala> mp += ("d"->5)
			res19: mp.type = Map(b -> 2, d -> 5, a -> 1, c -> 4)

			#删除一个key，或者写成mp.remove("d")
			scala> mp -= "d"
			res21: mp.type = Map(b -> 2, a -> 1, c -> 4)
 */

}
