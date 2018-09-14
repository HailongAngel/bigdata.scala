package scala.day05


/**
  * 视图界定下界
  * Created by zhangjingcun on 2018/9/14 15:57.
  */

class GranderFather
class Father extends GranderFather
class Son extends Father

/**
  * 定义一个下界
  */
object LowerBound {

  def getCardId[T >: GranderFather](person: T): Unit ={
    println("OK, 给你")
  }

  def main(args: Array[String]): Unit = {
    //调用
    getCardId[GranderFather](new GranderFather)

    //报错，Father是GranderFather的子类
    //    getCardId[Father](new Father)
    //
    //    getCardId[Son](new Son)
  }
}