package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem10Spec extends FlatSpec with Matchers {

  it should "run-length encoding of a list" in {
    val values = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    val result = Problem10.encode(values)
    result should be (expected)
  }

  "An empty list" should "return Nil" in {
    val empty = Nil

    val result = Problem10.encode(empty)
    result should be (Nil)
  }
}