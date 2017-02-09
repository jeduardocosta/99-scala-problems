package com.jeduardocosta.scala99problems

/**
  P14 (*) Duplicate the elements of a list.
  Example:
  scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */

object Problem14 {
  def duplicate[T](items: List[T]): List[T] = {
    items flatMap { item => List(item, item) }
  }
}