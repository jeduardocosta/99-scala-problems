package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem08Spec extends FlatSpec with Matchers {

  it should "remove sequencial duplicates with numbers list" in {
    val numbers = List(1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9)
    var result = Problem08.compress(numbers)
    result should be (1 to 9 toList)
  }

  it should "return empty list given non valid items" in {
    val items = List()
    val result = Problem08.compress(items)
    result should be (Nil)
  }
}