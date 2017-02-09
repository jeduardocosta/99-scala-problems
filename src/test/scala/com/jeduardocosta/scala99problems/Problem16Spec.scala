package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem16Spec extends FlatSpec with Matchers {

  it should "drop every Nth element from a list" in {
    val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

    val result = Problem16.drop(3, values)
    result should be (expected)
  }
}