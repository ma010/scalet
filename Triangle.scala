import PascalTriangle.PascalTriangle.pascaltri

object Triangle {
  def main(args: Array[String]) {
    val ptri = pascaltri(args(0))
    /**
   * display Pascal's triangle in
   * a specific format
   */  
    println("[")
    for {row <- ptri.indices} {
      if (row < ptri.indices.last)
      // mkString(start, sep, end)
        println(ptri(row).mkString(" "*(ptri.length-row)+"[", ",", "],"))
      else
        println(ptri(row).mkString(" "*(ptri.length-row)+"[", ",", "]"))
    }
    println("]")
  }
}