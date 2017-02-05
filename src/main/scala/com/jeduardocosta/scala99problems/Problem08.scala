package com.jeduardocosta.scala99problems

/**
P08 (**) Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element.
  The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */

object Problem08 {
  import Problem01.last

  def compress(items: List[Any]): List[Any] = {
    def compressIter(items: List[Any], result: List[Any]): List[Any] = items match {
      case Nil => result
      case h :: t if h == last(result).getOrElse(None) => compressIter(t, result)
      case _ => compressIter(items.tail, result :+ items.head)
    }

    compressIter(items, Nil)
  }
}