package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem01Spec extends FlatSpec with Matchers {

  it should "return last number given a valid list with numbers" in {
    val numbers = List(1, 1, 2, 3, 5, 8)
    val lastNumber = Problem01.last(numbers)
    lastNumber.get should be (8)
  }

  it should "return last word given a valid list with words" in {
    val words = List("country", "sun", "fish", "tree")
    val lastWord = Problem01.last(words)
    lastWord.get should be ("tree")
  }

  it should "return last item given a list with null values" in {
    val items = List(1, 2, null, 3, null, 10)
    var lastItem = Problem01.last(items)
    lastItem.get should be (10)
  }

  it should "return none given an empty list" in {
    val items = List()
    val lastItem = Problem01.last(items)
    lastItem should be (None)
  }
}