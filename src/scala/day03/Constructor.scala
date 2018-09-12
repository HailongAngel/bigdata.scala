package scala.day03
/**
  * 构造器例子
  * 在scala中，主构造器是于类名放在一起的，有且只有一个，于Java不同，java可以写多个构造方法，多个构造方法间实现重载
  * 在类中，没有定义在任何方法中的代码（包括成员字段），都属于主构造器的代码，且执行顺序于代码书写的顺序是一致的，其实与java一样
  * 在java中方法之外的代码（成员及代码块），在构造器调用之前最先执行，姑且将这些代码看做也是一个主构造器中进行执行的,相当于，成员变量先执行，构造方法后执行
  * 主构造器还可以通过使用默认参数，来给参数默认的值
  *
  *  -2 辅助构造器
  * 辅助构造可以有多个
  * 多个辅助构造器之间可以调用
  * 辅助构造中的参数不可以加val或者var
  *
  * -3 私有构造器
  * 私有构造器是针对于主构造器的
  * 如果声明了私有构造器，那么只能被他的伴生对象访问
  * 如果主构造器设置为私有构造器，那么辅助构造器依然可以访问（访问权限）
  * Created by zhangjingcun on 2018/9/12 15:25.
  */
class Constructor private(val name:String, var age:Int, money:Double, sex:String = "nan") {

  println("*************我是主构造器*******************************")
  println(s"your name is ${name} , your age is ${age}")

  /**
    * 声明一个辅助构造器
    * @param name
    * @param age
    * @param money
    * @param sex
    * @param height
    */
  def this(name:String, age:Int, money:Double, sex:String, height:Double){
    this(name, age, money, sex)  //在辅助构造器中第一行代码必须调用主构造器
    println("*************我是第一个辅助构造器*******************************")
  }

  def this(name:String, age:Int, money:Double, sex:String, height:Double, weight:Double) {
    this(name, age, money, sex, height)//在辅助构造器中第一行代码必须调用主构造器
    println("*************我是第二个辅助构造器*******************************")
  }
}

object Constructor {
  def main(args: Array[String]): Unit = {
    println("============第一次实例化===================")
    val constructor = new Constructor("张三", 20, 1000 )
    //    println(constructor.name)
    //    println(constructor.age)
    //
    //    constructor.age = 21
    //    println(constructor.age)

    println("============第二次实例化===================")
    //如果不指定val或者var， 该参数默认的作用域是private[this]
    //println(constructor.money)
    val constructor2 = new Constructor("张三", 20, 1000, "nan",180 )

    println("============第三次实例化===================")
    val constructor3 = new Constructor("张三", 20, 1000, "nan",180,150 )
  }
}
object  ConstructorTest{
  def main(args: Array[String]): Unit = {
    val constructor = new Constructor("张三", 20, 1000,"nan",100 )
  }
}