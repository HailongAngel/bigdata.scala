package scala.day01.loop

object ifDemo {
  def main(args: Array[String]): Unit = {
    var x = 1
    var y = if (x>0) 1 else  -1
    println(y)

println("-------------------------------")
    //支持混合类型
    val z = if(x>1) 1 else "小于1"

    println(z)
    println("------------------------")
    //如果缺失else，相当于if (x > 2) 1 else ()
    val m = if (x >1) 1
    println(m)

    println("-------------------------------")
    //if和else if
    val k = if(x < 0) 0
    else if (x>=1) 1
    else -1
    println(k)
  }


  println("-------------块表达式---------------")
  val a = 0
  val result = {
    if (a == 0){

      println(1)
      2
      0
      3
    }
    else if (a>1)1
    else{
      "error"
    }
  }
  println(result)
  println("---------------------结束------------------------")
}
