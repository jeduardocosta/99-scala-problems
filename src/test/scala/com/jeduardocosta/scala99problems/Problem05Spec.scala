package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem05Spec extends FlatSpec with Matchers {

  it should "return reverse list" in {
    val numbers = List(1, 7, 2, 3, 5, 8)
    val reversedList = Problem05.reverse(numbers)
    reversedList should be (List(8, 5, 3, 2, 7, 1))
  }

  it should "return empty list when trying reverse it" in {
    val items = List()
    val reversedList = Problem05.reverse(items)
    reversedList.isEmpty should be (true)
  }
}