package com.jeduardocosta.scala99problems

/**
P12 (**) Decode a run-length encoded list.
  Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  Example:

  scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */

object Problem12 {
  def decode[T](items: List[(Int, T)]): List[T] = {
    items.flatMap(item => List.fill(item._1)(item._2))
  }
}