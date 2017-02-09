package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem17Spec extends FlatSpec with Matchers {

  it should "split a list into two parts" in {
    val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val expected = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

    val result = Problem17.split(3, values)
    result should be (expected)
  }

  it should "return same list when entry index is invalid" in {
    val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    val result = Problem17.split(20, values)
    result should be ((values, Nil))
  }

  "An empty list" should "be Nil" in {
    val result = Problem17.split(2, Nil)
    result should be ((Nil, Nil))
  }
}