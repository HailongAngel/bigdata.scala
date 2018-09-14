package scala.day04.traitdemo

/**
  * Created by zhangjingcun on 2018/9/13 10:39.
  */
class Dog {
}

object Dog{
  def main(args: Array[String]): Unit = {
    //动态添加特质，在创建类的实例的时候，可以动态添加特质
    val dog = new Dog with Beatable
    dog.beat

    val dog2 = new Dog with Flyable{
      //实现了特质方法
      override def fly(): Unit = {
        println("坐飞机")
      }
    }
    dog2.fly()
  }
}