package com.jeduardocosta.scala99problems

import org.scalatest._

class Problem06Spec extends FlatSpec with Matchers {

  it should "be true when list is palindrome" in {
    val numbers = List(1, 2, 3, 4, 3, 2, 1)
    Problem06.isPalindrome(numbers) should be (true)
  }

  it should "be false when list is not palindrome" in {
    val items = List(1, 2, 3, 5, 2, 1, 3)
    Problem06.isPalindrome(items) should be (false)
  }

  it should "be false when list is empty" in {
    val items = List()
    Problem06.isPalindrome(items) should be (false)
  }
}