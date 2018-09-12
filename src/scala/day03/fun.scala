package scala.day03
/** 函数相关操作
  * Created by zhangjingcun on 2018/9/12 8:14.
  */
object FuncDemo {

  /**
    * 函数的参数默认值，建议有默认值的参数放到参数列表的最后
    * sayHello("Tom", "Hello") ->正常
    * sayHello("Tom")          ->正常，如果没有传递msg参数则使用默认参数
    *
    * @param name
    * @param msg
    */
  def sayHello(name:String, msg:String="Hi ！"): Unit = {
    println(msg + " " + name)
  }

  /**
    * 调用函数式为可以指定函数的参数进行赋值，指定的名称要与函数声明时参数名称相同
    * sayHello2() -> 正常
    * sayHello2   -> Error
    * sayHello2(name = "Mike")  ->正常
    * @param name
    */
  def sayHello2(name:String = "Tom"): Unit = {
    println("Hello , " + name)
  }

  /**
    * 定义变长参数的函数
    * String* 表示接受一系列的String类型的值，类似于java语言的可变参数
    * 内部来说：变长函数的类型实际上是一个数组，比如String*，Array[String]
    * 调用：
    * printCourses("Hadoop", "Spark", "Hive", "Hbase") ->正确
    * val arr = Array("Hadoop", "Spark", "Hive", "Hbase")
    * scala>     printCourses(arr)  ->错误
    * <console>:14: error: type mismatch;
    * found   : Array[String]
    * required: String
    * printCourses(arr:_*)    ->正确
    * printCourses(arr)
    * @param courses
    */
  def printCourses(courses:String*): Unit = {
    //courses.foreach(x => println(x))
    courses.foreach(println)
  }

  /**
    * 每天上班，到公司的时候，看到同事或者领导都打招呼
    * 针对不同同事，打招呼的方式不同
    * - 领导
    *   领导， 好
    * - 普通同事
    *   早
    * - 关系好的同事
    *   早啊，老王
    *  这就一个高阶函数
    * @param name
    * @param func
    */
  def greeting(name:String, func:(String)=>Unit): Unit = {
    func(name)
    //类似于
    //val f = (name: String) => println(s"${name}，好")
    //f(name)
  }

  def main(args: Array[String]): Unit = {
    greeting("高总", (name: String) => println(s"${name}，好"))
    greeting("Tom", (name: String) => println("早"))
    greeting("老王", (name: String) => println(s"早啊，${name}"))

    //其他方式调用
    //将匿名函数赋值给变量，进行传递
    val sayGao = (name: String) => println(s"${name}，好")
    greeting("高总", sayGao)

    //另一种写法
    def say(name:String) = println(name +"，早")
    greeting("马总", say)

    /**
      * scala 一切是为了简洁，能简单就简单， 能省略就省略
      */
    //方式一：完整写法
    greeting("高总", (name: String) => println(s"${name}，好"))

    //方式二：正常写法
    greeting("高总", (name)=>println(s"${name} ，好"))

    //方式三：对于只有一个参数的函数，可以省略小括号
    greeting("高总", name =>println(s"${name} ，好"))

    //方式四：如果参数在右侧代码体中， 有且只有一次使用<当有多个参数的时候，调用顺序和参数列表顺序必须一致>,
    //        可以省略参数，直接在右侧代码体中使用_代替
    greeting("高总", println(_, "好"))
  }
}
