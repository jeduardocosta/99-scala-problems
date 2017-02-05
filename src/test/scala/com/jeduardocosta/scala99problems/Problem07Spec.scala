package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem07Spec extends FlatSpec with Matchers {

  it should "flatten an nested list" in {
    val items = List(List(1, 1), 2, List(3, List(5, 8)))
    var result = Problem07.flatten(items)
    result should be (List(1, 1, 2, 3, 5, 8))
  }

  it should "flatten an nested list using flatMap" in {
    val items = List(List(1, 1), 2, List(3, List(5, 8)))
    var result = Problem07.flattenWithFlatMap(items)
    result should be (List(1, 1, 2, 3, 5, 8))
  }

  it should "flatten an list without nested elements" in {
    val items = List(1, 2, 3)
    val result = Problem07.flatten(items)
    result should be (List(1, 2, 3))
  }

  it should "return empty list" in {
    val items = List()
    Problem07.flatten(items) should be (List())
  }
}