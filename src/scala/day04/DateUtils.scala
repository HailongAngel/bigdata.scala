package scala.day04

import java.text.SimpleDateFormat
import java.util.Calendar

/**
  * 作为存放工具函数或者常量的地方和
  * Object
  *
  */
object DateUtils {
  //传入格式
  def getCurrentDate:String = getCurrentDateTime("EEEE, MMMM d")

  def getCurrentTime:String = getCurrentDateTime("K:m aa")
//封装一个定义时间的方法
  private def getCurrentDateTime(dateTimeFormat:String) :String = {
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime)
  }

}
object Test{
  def main(args: Array[String]): Unit = {

    println(DateUtils.getCurrentDate)
    println(DateUtils.getCurrentTime)
  }
}
