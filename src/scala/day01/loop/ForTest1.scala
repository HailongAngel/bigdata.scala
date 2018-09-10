package scala.day01.loop

object ForTest1 {
  val arr = 1 to 10
  def main(args: Array[String]): Unit = {

    println("------------------------方式1--------------")
    for (item <- arr)
      print( item+ " ")
  }
  println("---------------------方式2（输出取余3为0的数据，完整写法）--------------------")
  for (item <- arr  ){
    if(item % 3 ==0)
      print(item + " ")
  }
  println()
  println("---------------------方式3（输出取余3为0的数据，简单写法）--------------------")
  for(item <- arr if item % 3 == 0)
    print( item + " ")
  println()
  println("-------------------方式4 循环倒序输出-------------------------------")
    for (item <- 1 to 3 reverse){
      print(item + " ")
    }
  println("-------------------方式5  循环嵌套输出九九乘法表")
  for(i <- 1 to 9){
    for (j <- 1 to i){
      if (j ==1 )  println()
      print(i * j + " ")
    }

    println("--------------------方式6 九九乘法表  简洁写法---------------------")
    for (i <- 1 to 9 ;j <- 1 to i ){

      if (j == 1) println()
      print(i * j + " ")
    }
    println("*********************方式七 （嵌套循环时，任意指定某个循环倒序输出）********************")
    for (i <- 1 until 9 reverse; j <- 1 to 5){
      print (i + "--" + j + " ")
    }
    println("---------------------方式八-------------------------------------------")
    for {
      i <- 1 to 9
      j <- 1 to i
    } {
        if (j == 1){
          println()

        }
      print(i * j + " ")
      }
    println("-------------------------------------------for绑定中间的变量-------------")
    var names = Array("tom","marry","mike","","")
    for {
      name <- names
      tmpName = name.trim()
      if tmpName.length > 0
    }{
      println(tmpName)
    }
    println("******基于已有的集合产生新的集合- yield*************")
    var result = for (item <- 1 to 10 if item % 2 == 0 ) yield{
      item * 2
    }
    print(result  + " ")
  }
  println("------------------------------")
  var list = List("Marry","Tom","aa")
  list.foreach(println)
  print("------------------------------------")
}
