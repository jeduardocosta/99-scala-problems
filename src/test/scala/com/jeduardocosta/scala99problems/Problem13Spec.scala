package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem13Spec extends FlatSpec with Matchers {

  it should "run-length encoding of a list (direct solution)." in {
    val values = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    val result = Problem13.encodeDirect(values)
    result should be (expected)
  }

  it should "return empty list given Nil" in {
    val result = Problem13.encodeDirect(Nil)
    result should be (List.empty)
  }
}