package com.jeduardocosta.scala99problems

/**
P21 (*) Insert an element at a given position into a list.
  Example:
  scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */

object Problem21 {
  def insertAt(value: Any, position: Int, origin: List[Any]): List[Any] = {

    def insertAtIter(current: Int, items: List[Any], result: List[Any]): List[Any] = {
      if (items.isEmpty) result
      else {
        val newResult =
          if (current == position) result :+ value :+ items.head
          else result :+ items.head

        insertAtIter(current + 1, items.tail, newResult)
      }
    }

    insertAtIter(0, origin, Nil)
  }

  def insertAtWithSplit[T](value: T, position: Int, origin: List[Any]): List[Any] = origin.splitAt(position) match {
    case (pre, post) => pre ::: value :: post
  }
}