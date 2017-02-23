package com.jeduardocosta.scala99problems

/**
P20 (*) Remove the Kth element from a list.
  Return the list and the removed element in a Tuple. Elements are numbered from 0.
  Example:

  scala> removeAt(1, List('a, 'b, 'c, 'd))
  res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */

object Problem20 {
  def removeAt[T](index: Int, items: List[T]): (List[T], Option[T]) = {
      def removeAtIter(i: Int, items: List[T], result: List[T], removed: Option[T]): (List[T], Option[T]) = items match {
        case h :: t if i == 0 => removeAtIter(i - 1, t, result, Some(h))
        case h :: t => removeAtIter(i - 1, t, result :+ h, removed)
        case _ => (result, removed)
      }

    removeAtIter(index, items, Nil, None)
  }
}