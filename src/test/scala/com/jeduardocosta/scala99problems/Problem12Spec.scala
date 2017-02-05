package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem12Spec extends FlatSpec with Matchers {

  it should "decode a run-length encoded list" in {
    val values = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    val result = Problem12.decode(values)
    result should be (expected)
  }
}