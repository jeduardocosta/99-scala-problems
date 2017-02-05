package com.jeduardocosta.scala99problems

/**
P04 (*) Find the number of elements of a list.
  Example:
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6
  */

object Problem04 {
  def length[T](items: List[T]): Int = {
    def lengthIter(items: List[T], acc: Int = 0): Int = items match {
      case Nil => acc
      case _ :: tail => lengthIter(tail, acc + 1)
    }

    lengthIter(items)
  }
}