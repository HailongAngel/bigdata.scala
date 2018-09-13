package scala.day04.List

/**
  * 有序列表List使用
  * Created by zhangjingcun on 2018/9/13 15:16.
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个List，不可改变的集合
    val list = List(1,2,3,4,5,6)
    println(s"length=${list.length} size=${list.size}")

    //在scala中list的组成
    //TODO:List=head（头部元素）+tail(是一个list，除了头部元素以外的其他元素)
    println(s"head:${list.head} tail:${list.tail}")

    println("************************************************************************")
    //TODO:如果list中只有一个元素的话，head元素为第一个元素值，tail为一个空的集合list
    val list2 = List(1)
    println(s"head:${list2.head} tail:${list2.tail}")
    println("************************************************************************")

    //创建List的第二种方式
    //在scala中list的空list，可以使用Nil进行标识
    //Nothing Nil Null
    val list3 = 1::Nil
    println(s"head:${list3.head} tail:${list3.tail}")

    println("将List中的元素转换成一个字符串")
    println(s"tail:${list.tail.mkString("<", ",", ">")}")
    println("************************************************************************")
    //如何使用Nil进行元素的构建
    val list4 = 3::2::1::Nil
    println(s"list4:${list4}")

    println("************************************************************************")
    val list5 = List(5,4,3)::List(2,1)
    println(s"list5:${list5}")


    println("**************************使用可变集合List**********************************************")
    //1：首先引入一个包，ListBuffer相当于ArrayBuffer，可以动态的增加修改数据
    import scala.collection.mutable.ListBuffer

    val lb = new ListBuffer[Int]()

  }

  /*

  List
			scala> val lst = List(1,2,3,5)
			lst: List[Int] = List(1, 2, 3, 5)

			scala> lst(1)
			res2: Int = 2

			scala> lst(3)
			res3: Int = 5

			#修改元素内容抛出异常
			scala> lst(3) = 10
			<console>:13: error: value update is not a member of List[Int]
				   lst(3) = 10

			#修改集合长度抛出异常
			scala> lst += 16
			<console>:13: error: value += is not a member of List[Int]
			  Expression does not convert to assignment because receiver is not assignable.
				   lst += 16
					   ^

			#引入可变集合包
			scala> import scala.collection.mutable.ListBuffer
			import scala.collection.mutable.ListBuffer

			#可以看到这是可变的集合，但是一定要先引入 import scala.collection.mutable.ListBuffer包后才能使用
			scala>  val	 lb = new ListBuffer[Int]()
			lb: scala.collection.mutable.ListBuffer[Int] = ListBuffer()

			#追加一条数据
			scala> lb.append(1)

			scala> lb
			res10: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1)

			#可以修改里面的值
			scala> lb(0) = 10

			scala> lb
			res3: scala.collection.mutable.ListBuffer[Int] = ListBuffer(10)

			#也是可以这样追加
			scala> lb += 20
			res4: lb.type = ListBuffer(10, 20)

			#也可以追加一个元组
			scala> lb += (30,40,50)
			res5: lb.type = ListBuffer(10, 20, 30, 40, 50)

			#也可以追加一个List， 但是需要++=
			scala> lb ++= List(60,70,80)
			res7: lb.type = ListBuffer(10, 20, 30, 40, 50, 60, 70, 80)

			#也可以追加一个Array
			scala> lb ++= Array(90, 100)
			res8: lb.type = ListBuffer(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

			#删除一个元素
			scala> lb -= 90
			res9: lb.type = ListBuffer(10, 20, 30, 40, 50, 60, 70, 80, 100)

			#根据下标删除
			scala> lb.remove(0)
			res10: Int = 10

			#删除一个元组
			scala> lb -= (20,30)
			res12: lb.type = ListBuffer(40, 50, 60, 70, 80, 100)

			#匹配上进行删除，无匹配的则忽略
			scala> lb -= (20, 40)
			res13: lb.type = ListBuffer(50, 60, 70, 80, 100)
   */
}
