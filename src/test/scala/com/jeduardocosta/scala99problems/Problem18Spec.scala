package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem18Spec extends FlatSpec with Matchers {
  val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val expected = List('d, 'e, 'f, 'g)
  val start = 3
  val end = 7

  it should "extract a slice from a list using slice1" in {
    val result = Problem18.slice1(start, end, values)
    result should be (expected)
  }

  it should "extract a slice from a list using slice2" in {
    val result = Problem18.slice2(start, end, values)
    result should be (expected)
  }

  it should "extract a slice from a list using slice3" in {
    val result = Problem18.slice3(start, end, values)
    result should be (expected)
  }
}