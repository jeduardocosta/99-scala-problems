package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem04Spec extends FlatSpec with Matchers {

  it should "return length of non empty collection" in {
    val numbers = List(1, 7, 2, 3, 5, 8)
    val length = Problem04.length(numbers)
    length should be (6)
  }

  it should "return 0 for empty list" in {
    val items = List()
    val length = Problem04.length(items)
    length should be (0)
  }
}