package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem14Spec extends FlatSpec with Matchers {

  it should "duplicate the elements of a list" in {
    val values = List('a, 'b, 'c, 'd)
    val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'd, 'd)

    val result = Problem14.duplicate(values)
    result should be (expected)
  }
}