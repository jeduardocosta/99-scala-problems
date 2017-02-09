package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem15Spec extends FlatSpec with Matchers {

  it should "duplicate the elements of a list a given number of times" in {
    val values = List('a, 'b, 'c, 'c, 'd)
    val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

    val result = Problem15.duplicateN(3, values)
    result should be (expected)
  }
}