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
  def p03(index: Int, list: List[Int]) : Int =
    (index, list) match {
      case (0, h :: _) => h
      case (n, _ :: t) => p03(n-1, t)
      case (_, Nil) => throw  new NoSuchElementException
    }




}
