package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem02Spec extends FlatSpec with Matchers {

  it should "return penultimate number given a valid list with numbers" in {
    val numbers = List(1, 1, 2, 3, 5, 8)
    val penultimateNumber = Problem02.penultimate(numbers)
    penultimateNumber.get should be (5)
  }

  it should "return penultimate word given a valid list with words" in {
    val words = List("country", "sun", "fish", "tree")
    val penultimateWord = Problem02.penultimate(words)
    penultimateWord.get should be ("fish")
  }

  it should "return penultimate item given a list with null values" in {
    val items = List(1, 2, null, 3, 10)
    var penultimateItem = Problem02.penultimate(items)
    penultimateItem.get should be (3)
  }

  it should "return none given an empty list" in {
    val items = List()
    val penultimateItem = Problem02.penultimate(items)
    penultimateItem should be (None)
  }
}