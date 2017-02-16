package com.jeduardocosta.scala99problems

/**
P11 (*) Modified run-length encoding.
  Modify the result of problem P10 in such a way that if an element has no duplicates
  it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  Example:

  scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */

object Problem11 {
  import Problem10._

  def encodeModified[T](items: List[T]): List[Any] = {
    def encodeIter(grouped: List[(Int, T)]): List[Any] = grouped match {
      case (h1, h2) :: t => (if (h1 == 1) h2 else (h1, h2)) :: encodeIter(t)
      case _ => Nil
    }

    encodeIter(encode(items))
  }

  def encodeModifiedWithMap[T](items: List[T]): List[Any] =
    encode(items).map(item => if (item._1 == 1) item._2 else item)
}