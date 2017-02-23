package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem20Spec extends FlatSpec with Matchers {
  val values = List('a, 'b, 'c, 'd)

  it should "remove the Kth element from a list" in {
    val expected = (List('a, 'c, 'd), Some('b))

    val result = Problem20.removeAt(1, values)
    result should be (expected)
  }

  it should "remove the first element from a list" in {
    val expected = (List('b, 'c, 'd), Some('a))

    val result = Problem20.removeAt(0, values)
    result should be (expected)
  }

  it should "remove the last element from a list" in {
    val expected = (List('a, 'b, 'c), Some('d))

    val result = Problem20.removeAt(3, values)
    result should be (expected)
  }

  it should "given invalid element should result entry list" in {
    val expected = (List('a, 'b, 'c, 'd), None)

    val result = Problem20.removeAt(5, values)
    result should be (expected)
  }
}