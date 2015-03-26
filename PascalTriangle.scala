/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */


def pascaltri (k: Int) {
  val rows = 0 until k
  val ptri = rows.toArray map (x => Array.fill(x+1)(1))
  if (rows.length >= 2) {
    for {
      row <- ptri.indices.init
      if (row >= 1)
      col <- ptri(row).indices.init
    } {
      ptri(row+1)(col+1) = ptri(row)(col) + ptri(row)(col+1)
    }  
  }
  println("[")
  for {row <- ptri.indices} {
    if (row < ptri.indices.last)
      println(ptri(row).mkString(" "*(ptri.length-row)+"[", ",", "],"))
    else
      println(ptri(row).mkString(" "*(ptri.length-row)+"[", ",", "]"))
  }
  println("]")
}


pascaltri(10)
