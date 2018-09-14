package scala.day05.casedemo

/**
  * 封装异常工具方法
  */

import java.io.FileNotFoundException

object SimpleValueDemo {
  def  proessException(e:Exception) :Unit = {
    e match {
      case e1: IllegalArgumentException => println("Illegal Argument Exception")
      case e2: FileNotFoundException => println("can not find the file.....")
      case e3: ArithmeticException => println("Arithmetic Exception")
      case e4: NumberFormatException => println("Number Format Exception....")
      case _e:Exception => _e.printStackTrace()
    }
  }

  def main(args: Array[String]): Unit = {
    try {
      val result = 1/0
      println(s"result ${result}")

    }catch {
      case e:Exception => proessException(e)
    }

  }

}
