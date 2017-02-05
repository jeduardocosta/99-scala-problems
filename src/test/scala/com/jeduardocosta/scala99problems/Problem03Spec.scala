package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem03Spec extends FlatSpec with Matchers {

  it should "return expected number given collection position" in {
    val numbers = List(1, 7, 2, 3, 5, 8)
    val expected = Problem03.nth(4, numbers)
    expected.get should be (5)
  }

  it should "return expected word given collection position" in {
    val words = List("country", "sun", "fish", "tree")
    val expected = Problem03.nth(1, words)
    expected.get should be ("sun")
  }

  it should "return expected item given collection with null values" in {
    val items = List(1, 2, null, 3, null, 10, 5, null, 1)
    var expected = Problem03.nth(5, items)
    expected.get should be (10)
  }

  it should "return none given an empty list" in {
    val items = List()
    val expected = Problem03.nth(2, items)
    expected should be (None)
  }
}