package com.jeduardocosta.scala99problems

/**
P16 (**) Drop every Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */

object Problem16 {
  def drop[T](index: Int, items: List[T]): List[T] = {
    def dropIter(acc: Int, items: List[T]): List[T] = (acc, items) match {
      case (_ , Nil) => Nil
      case (1, _ :: t) => dropIter(index, t)
      case (_, h :: t) => h :: dropIter(acc - 1, t)
    }

    dropIter(index, items)
  }
}