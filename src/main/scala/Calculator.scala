package com.haile.app

class Calculator {

  def plus (a: Double, b: Double): Double = { a + b }

  def minus (a: Double, b: Double) : Double = { a - b }

  def multiply (a: Double, b: Double) : Double = { a * b }

  def divide (a: Double, b: Double) : Option[Double] = {
    if(b == 0) None else Some(a / b)
  }

}
