package com.jeduardocosta.scala99problems

/**
P19 (**) Rotate a list N places to the left.
  Examples:
  scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  */

object Problem19 {
  def rotate(index: Int, items: List[_]): List[_] = {
    def rotateIter(index: Int, items: List[_], result: List[_]): List[_] = items match {
      case h :: t => {
        if (index > 0) rotateIter(index - 1, t, result :+ h)
        else items ::: result
      }
      case _ => result
    }

    rotateIter(index, items, Nil)
  }
}