
def rows (k: Int): Array[Array[Int]] = {
  val allRows = Array[Array[Int]]()
  for (line <- 1 until k) {
    allRows :+ Array.fill(line)(1)
    for (num <- 1 until (k-2) if (k > 2)){
      allRows(line-1)(num) = allRows(line-2)(num-1) + allRows(line-2)(num)
      } yield allRows
  } yield 1
}

val pascalTri = rows(5)
println(pascalTri)

//for (
//  row <- pascalTri
//  num <- row
//) println(num)