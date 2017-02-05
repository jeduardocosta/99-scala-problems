package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem11Spec extends FlatSpec with Matchers {

  it should "modified run-length encoding" in {
    val values = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

    val result = Problem11.encodeModified(values)
    result should be (expected)
  }

  "An empty list" should "return Nil" in {
    val empty = Nil

    val result = Problem11.encodeModified(empty)
    result should be (Nil)
  }
}