package scala.day05

/** 一个上界的例子， 定义父类（交通工具）
  * Created by zhangjingcun on 2018/9/14 15:24.
  */
class  Vehicle {
  /**
    * 函数，驾驶
    */
  def driver() = println("Driving...")
}

/**
  * 汽车
  */
class Car extends Vehicle{
  /**
    * 函数，驾驶
    */
  override def driver(): Unit = println("Car Driving.....")
}

/**
  * 宝马
  */
class BWM extends  Car{
  /**
    * 函数，驾驶
    */
  override def driver(): Unit = println("BWM Driving....")
}

/**
  * 自行车
  */
class Bike extends Vehicle{
  /**
    * 函数，驾驶
    */
  override def driver(): Unit = println("Bike Driving...")
}

/**
  * 定义一个苹果，跟交通工具无关
  */
class Apple

object UpperBound {

  /**
    * 定义函数，T必须是一种交通工具
    * @param v
    * @tparam T
    */
  def takeVehicle[T <: Car](v:T): Unit ={
    v.driver()
  }

  def main(args: Array[String]): Unit = {

    //    //创建一个交通工具
    //    val v = new Vehicle
    //    takeVehicle(v)

    val c = new Car
    takeVehicle(c)

    //    var b = new Bike
    //    takeVehicle(b)
    //
    //    val bmw = new BWM
    //    takeVehicle(bmw)
  }

}
