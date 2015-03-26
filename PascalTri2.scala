
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
  for {row <- ptri.indices}
  println(ptri(row).mkString(" "*(ptri.length-row)+"[", ",", "]"))
}


pascaltri(5)
