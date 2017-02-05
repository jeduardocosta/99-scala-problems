package com.jeduardocosta.scala99problems

/**
P22 (*) Create a list containing all integers within a given range.
  Example:
  scala> range(4, 9)
  res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */

object Problem22 {
  def range(start: Int, end: Int): List[Int] = {
    def rangeIter(items: List[Int], end: Int): List[Int] = {
      if (end < start) items
      else rangeIter(end :: items, end - 1)
    }

    rangeIter(Nil, end)
  }
}