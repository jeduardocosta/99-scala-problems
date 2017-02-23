package com.jeduardocosta.scala99problems

/**
P18 (**) Extract a slice from a list.
  Given two indices, I and K, the slice is the list containing the elements
  from and including the Ith element up to but not including the Kth element
  of the original list. Start counting the elements with 0.
  Example:

  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */

object Problem18 {
  def slice1[T](start: Int, end: Int, items: List[T]): List[T] = {
    val records = end - start
    items.drop(start).take(records)
  }

  def slice2[T](start: Int, end: Int, items: List[T]): List[T] = items.slice(start, end)

  def slice3[T](start: Int, end: Int, items: List[T]): (List[T]) = {
    def slice3Iter(start: Int, end: Int, items: List[T], result: List[T]): List[T] = items match {
      case h :: t if start > 0 => slice3Iter(start - 1, end - 1, t, result)
      case h :: t if start < end => slice3Iter(start, end - 1, t, result :+ h)
      case h :: t if start == end => slice3Iter(start, end, t, result)
      case _ => result
    }

    slice3Iter(start, end, items, Nil)
  }
}