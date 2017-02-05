package com.jeduardocosta.scala99problems

/**
P06 (*) Find out whether a list is a palindrome.
  Example:
  scala> isPalindrome(List(1, 2, 3, 2, 1))
  res0: Boolean = true
  */

object Problem06 {
  import Problem05.reverse

  def isPalindrome[T](items: List[T]) = items match {
    case Nil => false
    case _ => items == reverse(items)
  }
}