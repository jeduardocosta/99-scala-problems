package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem09Spec extends FlatSpec with Matchers {

  it should "be placed in separate sublists" in {
    val values = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

    val result = Problem09.pack(values)
    result should be (expected)
  }

  "An empty list" should "return Nil" in {
    val empty = Nil

    val result = Problem09.pack(empty)
    result should be (Nil)
  }
}