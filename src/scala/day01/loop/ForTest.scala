package scala.day01.loop

object ForTest {
  def main(args: Array[String]): Unit = {
    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）
    //每次循环将区间中的一个值赋给i

    for (i <- 1 to 10)
      println(i)
//for(i <- 数组)
    println("-------------------------------------------")
    var arr = Array("a","b","c")
    for (i <- arr){
      print(i + " ")
    }
    println("-------------------------------------------")

    for (i <- 1 to 3 ; j <- 1 to 3 if  i != j)
       println(i + " " + j)

    println("******基于已有的集合产生新的集合- yield*************")
    val result = for (item <- 1 to 10 if item % 2 == 0)  yield {
      item * 2
    }
    println(result)
    println("-----------------for 循环------------")
    var list = List("Marry","Tom","Mike")
    for (s <- list)  println(s)
    println("----------------第二种方法---------")
    for{
      s <- list
      if (s.length)>3


    }
      println(s.length)

    println("------------第三种方法---------------")
    for (s <- list if s.length > 3)println(s)

    println("-------------第四种方法------------")
   var newList =  for {
     s <- list
     s1 = s.toUpperCase()


   }yield(s1)
    println(newList)

    println("-------------while循环------------------")
    var i = 0
    while(i<list.length){
      println(list(i))
      i += 1
    }
    println("-------------dowhile循环---------------")
    var j = 0
    do {
      println(list(j))
      j+=1

    }while(j < list.length)


  }

}
