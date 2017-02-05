package com.jeduardocosta.scala99problems

/**
P07 (**) Flatten a nested list structure.
  Example:
  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */

object Problem07 {
  def flatten(items: List[Any]): List[Any] = {
    def isList(x: Any) = x.isInstanceOf[List[_]]

    def flattenIter(item: Any, result: List[Any]): List[Any] = item match {
      case Nil => result
      case h :: t if isList(h) => flattenIter(t, result ::: flattenIter(h, List()))
      case h :: Nil => result :+ h
      case h :: t => flattenIter(t, result :+ h)
    }

    flattenIter(items, Nil)
  }

  def flattenWithFlatMap(items: List[Any]): List[Any] = items flatMap {
    case x: List[_] => flattenWithFlatMap(x)
    case x => List(x)
  }
}