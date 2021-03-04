package com.haile.app

class Calculator {

  def plus (a: Double, b: Double): Double = { a + b }

  def minus (a: Double, b: Double) : Double = { a - b }

  def multiply (a: Double, b: Double) : Double = { a * b }

  def divide (a: Double, b: Double) : Double = {
    // Check if b is zero
    require(b != 0, "you can't divide to zero")
    a / b
  }

}
