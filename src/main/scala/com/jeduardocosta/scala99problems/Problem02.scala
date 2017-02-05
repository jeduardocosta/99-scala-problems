package com.jeduardocosta.scala99problems

/**
P02 (*) Find the last but one element of a list.
  Example:
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
  */

object Problem02 {
  def penultimate[T](items: List[T]): Option[T] = items match {
      case Nil => None
      case head :: _ :: Nil => Some(head)
      case _ :: tail => penultimate(tail)
  }
}