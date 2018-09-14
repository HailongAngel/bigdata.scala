package scala.day05.casedemo
//样例类，模式匹配，封装数据（多例）,不用new即可创建实例
case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)
//样例对象，模式匹配（单例）
case object CheckTimeOutTask
/**
  * 样例类demo
  * 简单来说，scala的class，就是在普通类定义前加个case关键字，然后你就可以对这些类进行模式匹配
  * case class带来的最大的好处就是支持模式匹配
  */
object CaseDemo04 extends  App {
  val arr = Array(CheckTimeOutTask, new HeartBeat(123), HeartBeat(88888), new HeartBeat(666), SubmitTask("0001", "task-0001"))
  val a = arr(1)
  println(a)

  a match {
    case SubmitTask(id, name) => {
      println(s"$id,$name")
    }
    case  HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask=>{
      println("check")
    }
  }

}
