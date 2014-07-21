package com.ukon

import java.util.NoSuchElementException
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ProblemsTest extends FunSuite {

  test("find the last element in the list : l(1,3,5,2)") {
    val problem = new Problems
    val list = List(1, 3, 5, 2)
    val result = problem.p01(list)

    assert(result === 2)
  }

  test("find the last element in the list : l(1)") {
    val problem = new Problems
    val list = List(1)
    val result = problem.p01(list)

    assert(result === 1)
  }

  test("find the last element should throw exception for empty list") {
    val problem = new Problems
    val list = List()
    intercept[NoSuchElementException] {
      problem.p01(list)
    }
  }

  test("find the last element but one element in the list : l(6,2,7,3)") {
    val problem = new Problems
    val list = List(6, 2, 7, 3)

    val result = problem.p02(list)

    assert(result === 7)
  }

  test("find the last element but one element in the list : l(6,2)") {
    val problem = new Problems
    val list = List(6, 2)

    val result = problem.p02(list)

    assert(result === 6)
  }

  test("find the last element but one element in the list : l(2)") {
    val problem = new Problems
    val list = List(2)

    intercept[NoSuchElementException] {
      problem.p02(list)
    }
  }

  test("find the 3rd element in the list : l(2,6,9,4,1)") {
    val problem = new Problems
    val list = List(2, 6, 9, 4, 1)
    val index = 3

    val result = problem.p03(index, list)

    assert (result === 4)

  }


}
