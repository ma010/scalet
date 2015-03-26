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

/**
 * This function takes one parameter which specifies
 * the number of rows of Pascal's triangle
 */
def pascaltri (k: Int) {
  // define rows as a Range traversable: [0,k)
  val rows = 0 until k
  
  /**
   * define ptri as a 2-D array filled with 1s, e.g.:
     [1]
    [1,1]
   [1,1,1]
  [1,1,1,1]
 [1,1,1,1,1]
   */
  val ptri = rows.toArray map (x => Array.fill(x+1)(1))
  
  /**
   * iterate through the 2-D array and 
   * calculate based on the principle
   * of Pascal's triangle
   */
  if (rows.length >= 2) {
    for {
      row <- ptri.indices.init
      if (row >= 1)
      col <- ptri(row).indices.init
    } {
      ptri(row+1)(col+1) = ptri(row)(col) + ptri(row)(col+1)
    }  
  }
  
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


pascaltri(10)
