package com.jeduardocosta.scala99problems

/**
P01 (*) Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
  */

object Problem01 {
  def last[T](items: List[T]): Option[T] = items match {
      case Nil => None
      case head :: Nil => Some(head)
      case _ :: tail => last(tail)
  }
}