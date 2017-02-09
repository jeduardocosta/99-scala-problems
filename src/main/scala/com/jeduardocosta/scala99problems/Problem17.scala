package com.jeduardocosta.scala99problems

/**
P17 (*) Split a list into two parts.
  The length of the first part is given. Use a Tuple for your result.
  Example:

  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */

object Problem17 {
  def split[T](index: Int, items: List[T]): (List[T], List[T]) = {
    def splitIter(p1: List[T], p2: List[T]): (List[T], List[T]) = (p1, p2) match {
      case (_, Nil) => (p1, Nil)
      case (Nil, _) => splitIter(List(p2.head), p2.tail)
      case (x, _) if x.length == index => (p1, p2)
      case _ => splitIter(p1 :+ p2.head, p2.tail)
    }

    splitIter(Nil, items)
  }
}