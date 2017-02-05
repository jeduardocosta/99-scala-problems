package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem22Spec extends FlatSpec with Matchers {

  it should "create a list containing all numbers within a given range" in {
    var result = Problem22.range(1, 13)
    result should be (1 to 13 toList)
  }
}