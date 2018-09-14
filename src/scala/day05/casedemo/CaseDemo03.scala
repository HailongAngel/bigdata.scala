package scala.day05.casedemo

object CaseDemo03 extends  App{
  println("****************匹配数组********************")
  val  arr = Array(1,1,7,0)
  arr match {
    case  Array(0,2,x,y) => println(x + " " + y)
    case Array(1,1,7,0) => println("0 ...")
    case Array(1,1,7,y) => println("only 0 " + y)
    case _ => println("something else")

  }

println("*************匹配List************************")
  val lst = List(0,1,3,5,5) //Lis(),Nil代替
  println(s"head: ${lst.head}. tail:${lst.tail},lst:${lst}")
  lst match  {
    case 0 :: Nil => println("only 0")
    case x :: y :: Nil => println(s"x $x y $y")
    case 0 :: d => println(s"name : $d")
    case _ => println("something else")
  }

  println("*************匹配元组********************")
  val  tup = (1,3,8)
  tup match {
    case (1,x,y) => println(s"hello 123 $x , $y")
    case (_,w,5) => println(s"w : ${w}")
    case _ => println("else")
  }
}
