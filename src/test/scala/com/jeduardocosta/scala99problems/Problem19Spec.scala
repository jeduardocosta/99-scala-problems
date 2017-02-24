package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem19Spec extends FlatSpec with Matchers {

  it should "rotate a list n places to the left - case 1" in {
    val values =  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val expected = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

    val result = Problem19.rotate(3, values)
    result should be (expected)
  }

  it should "rotate a list n places to the left - case 2" in {
    val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val expected = List('f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c, 'd, 'e)

    val result = Problem19.rotate(5, values)
    result should be (expected)
  }

  it should "not rotate and return same list when index is greather than entry list" in {
    val values = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    val result = Problem19.rotate(99, values)
    result should be (values)
  }
}