package scala.day02.function

object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hadoop,hbase,spark,,hive,hbase ", "", "sqoop,pig,scala ,", "hbase,yarn",
      "java,sqoop,mysql, mysql ")
    println(lines)
    //1.对每一行数据进行分隔
    var mapTup = lines.flatMap(lines => (lines.trim().split(",")))
    //2.转换，去掉单词空格
      .map(word => word.trim())
    //3.数据过滤
      .filterNot(word => word.isEmpty())
    //4，将单词转换为二元组
      .map(word=>(word,1))

    println(mapTup)

    //上述过程比较麻烦，还有更简单的
    var mapTup2 = lines.flatMap(_.trim().split(",")).map(_.trim()).filterNot(_.isEmpty()).map((_,1))
    println(mapTup2)

    //3.数据分组
    val groupTup = mapTup2.groupBy(tup => tup._1)
    println(groupTup)

    //对每一组进行统计
    val result = groupTup.map(tuple => {
      val word = tuple._1
      val count = tuple._2.map(_._2).sum
      (word,count)
    })
    println(result)
    /**
      * 按照词频频率降序排序，取得出现频率最高的前三条数据
      */
    val sortTuple = result.toList.sortBy(-_._2).take(3)
    println(sortTuple)

    val sortTup2 = lines.flatMap(_.trim.split(","))
      .filterNot(_.isEmpty)
      .map((_,1))
      .groupBy(_._1)
       .map(tuple=>(tuple._1,tuple._2.map(_._2).sum))
      .toList.sortBy(-_._2)
       .take(3)
    println(s"sorted:${sortTup2}")
  }
}
