package com.jeduardocosta.scala99problems

/**
P03 (*) Find the Kth element of a list.
  By convention, the first element in the list is element 0.
  Example:
  scala> nth(2, List(1, 1, 2, 3, 5, 8))
  res0: Int = 2
  */

object Problem03 {
  def nth[T](index: Int, items: List[T]): Option[T] = (index, items) match {
    case (_, Nil) => None
    case (0, _) => items.headOption
    case (n, _ :: tail) => nth(index - 1, tail)
  }
}