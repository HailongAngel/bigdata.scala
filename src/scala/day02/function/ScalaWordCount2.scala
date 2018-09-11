package scala.day02.function

object ScalaWordCount2 {
  def main(args: Array[String]): Unit = {
    val lines = List("hadoop,hbase,spark,,hive,hbase ", "", "sqoop,pig,scala ,", "hbase,yarn",
      "java,sqoop,mysql, mysql ")
    val mapTuple = lines.flatMap(line=>line.trim.split(","))
      .filterNot(line=>line.isEmpty)
      .map(word=>(word.trim(),1))
    println(mapTuple)

    val groupTuple = mapTuple.groupBy(tuple=>tuple._1)
    println(groupTuple);

    val result = groupTuple.map(tuple=>{
      var word = tuple._1
      var count = tuple._2.map(_._2).sum
      (word,count)

    })
  }
}
