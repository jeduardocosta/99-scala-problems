package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem21Spec extends FlatSpec with Matchers {
  val entry = List("a", "b", 13, 1, "c")
  val expect = List("a", "b", "new", 13, 1, "c")

  it should "insert an element at a given position into a list" in {
    var result = Problem21.insertAt("new", 2, entry)
    result should be (expect)
  }

  it should "insert an element at a given position into a list and split function" in {
    var result = Problem21.insertAtWithSplit("new", 2, entry)
    result should be (expect)
  }
}