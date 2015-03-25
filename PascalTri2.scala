

val allRows = new Array[Array[Int]](5)
for {
  row <- allRows.indices
  //num <- row  
} 
{
  allRows(row) = new Array[Int](row+1)
  for {
    row 
  }
  println(allRows(row).length)
}


//
//for (line <- 1 until 6) {
//  allRows = allRows :+ Array.fill(line)(1)
//  println(allRows.length)
//  //for (num <- 1 until (5-2) if (5 > 2)){
//  //  allRows(line-1)(num) = allRows(line-2)(num-1) + allRows(line-2)(num)
//  //}
//}


//val pascalTri = rows(5)
//println(pascalTri)
