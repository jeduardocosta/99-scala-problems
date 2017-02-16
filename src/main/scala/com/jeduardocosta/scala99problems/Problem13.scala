package com.jeduardocosta.scala99problems

/**
P13 (**) Run-length encoding of a list (direct solution).
  Implement the so-called run-length encoding data compression method directly.
  I.e. don't use other methods you've written (like P09's pack); do all the work directly.
  Example:

  scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */

object Problem13 {
  def encodeDirect[T](items: List[T]): List[(Int, T)] = items match {
    case h :: _ => {
      val (group, tail) = items.span(_ == h)
      (group.length, group.head) :: encodeDirect(tail)
    }
    case _ => Nil
  }
}