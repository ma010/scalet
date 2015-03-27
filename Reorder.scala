/*
 * This script solves a specific ordering problem
 * as follows: put the last element of a list behind
 * the first, the second to the last behind the second, etc.
 * For example, a list (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) should
 * be reordered into (1, 10, 2, 9, 3, 8, 4, 7, 5, 6)
 */
/*
 * According to scala List's basic structure,
 * a new element (single-member list) can only
 * be prepended to the beginning of the list.
 * Therefore, in y :: ys, y is an element while
 * ys can be element(s) of list.
 * Double colons (::) means "construct", 
 * pronounced as "cons".
 */

def reorder (xs: List[Int]): List[Int] = xs match {  
  case List() => List() // empty list doesn't need reordering
  case y :: Nil => xs // list(a) doesn't need reordering
  case y :: y1 :: Nil => xs // list(a, b) doesn't need reordering
  case y :: ys => y :: ys.last :: reorder(ys.init) // recursion
}

// Initialize alist with values as (1, 2, 3, 4, 5, 6, 7, 8, 9)
val alist = List.range(1, 10)
val reordered = reorder(alist)
println(reordered.mkString("", " ", ""))
// Output should be: 1 9 2 8 3 7 4 6 5