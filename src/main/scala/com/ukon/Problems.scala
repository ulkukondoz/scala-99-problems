package com.ukon


class Problems {

  /**
   * find the last element of the list
   */
  def p01(list: List[Int]): Int =
    list match {
      case h :: Nil => h
      case h :: t => p01(t)
      case _ => throw new NoSuchElementException
    }

  /**
   * find the last but one element of the list
   */
  def p02(list: List[Int]): Int =
    list match {
      case e1 +: e2 +: Nil => e1
      case e1 +: e2 +: t => p02(t)
      case _ => throw new NoSuchElementException
    }

  /**
   * find the Kth element of the list
   * 0 base indexing
   */
  def p03(index: Int, list: List[Int]): Int =
    (index, list) match {
      case (0, h :: _) => h
      case (n, _ :: t) => p03(n - 1, t)
      case (_, Nil) => throw new NoSuchElementException
    }

  /**
   * find the number of element of a list
   */

  def p04(list: List[Int]): Int = {
    def _p04(size: Int, l: List[Int]): Int =
      l match {
        case _ :: t => _p04(size + 1, t)
        case Nil => size
      }
    _p04(0, list)
  }


  /**
   * reverse a list
   */
  def p05(list: List[Int]): List[Int] = {
    list.foldLeft(List[Int]()) { (l, r) => r :: l}
  }

  /**
   * find out where a list is palindrome
   */
  def p06(list: List[Int]): Boolean = {
    //    SOLUTION 1
    //    val reverseList: List[Int] = p05(list)
    //    list == reverseList

    if (list.size == 0 || list.size == 1) true
    else if (list.head == list.last) {
      p06(list.dropRight(1).drop(1))
    } else false
  }

  /**
   * flatten a nested list structure
   */
  def p07[A](list: List[A]): List[A] = ???


  /**
   * eliminate consecutive duplicates of list elements
   */
  def p08[A](list: List[A]): List[A] =
      list.foldLeft(List[A]()){ (l, r) => r :: l.dropWhile( _ == r ) }

}
