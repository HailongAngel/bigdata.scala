package scala.day04.traitdemo

class Monkey extends Animal with Beatable with Flyable {

  //实现特质方法

  override def fly: Unit = {
    println("不会飞")
  }
  //抽象方法，没有实现（重写父类抽象的方法，可以选择性的使用override）

  override def color(): Unit = {
    println("棕色")
  }

  override def eat(): Unit ={
    println("吃桃子")
  }
  //重写打架（特质）方法
  override def beat: Unit = {
    println("用棍子打架")
  }
  def apply: Monkey = new Monkey()
}
object Monkey{
  def main(args: Array[String]): Unit = {
    val monkey = new Monkey
    monkey.eat()
    monkey.color()
    monkey.beat
  }
}


