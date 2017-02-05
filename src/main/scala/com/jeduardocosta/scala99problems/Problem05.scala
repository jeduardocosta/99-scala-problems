package com.jeduardocosta.scala99problems

/**
P05 (*) Reverse a list.
  Example:
  scala> reverse(List(1, 1, 2, 3, 5, 8))
  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */

object Problem05 {
  def reverse[T](items: List[T]): List[T] = {
    def reverseIter(current: List[T], reversed: List[T]): List[T] = current match {
      case Nil => reversed
      case head :: tail => reverseIter(tail, head :: reversed)
    }

    reverseIter(items, Nil)
  }
}