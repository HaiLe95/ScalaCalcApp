package com.haile.app

import java.util.Scanner

object Main {
  def plus (a: Double, b: Double): Double = { a + b }

  def minus (a: Double, b: Double) : Double = { a - b }

  def multiply (a: Double, b: Double) : Double = { a * b }

  def divide (a: Double, b: Double) : Double = {
    // Check if b is zero
    require(b != 0, "you can't divide to zero")
    a / b
  }

  def main(args: Array[String]): Unit = {

    val scan = new Scanner(System.in)
    println("Please choose an action: plus, minus, divide or multiply")
    val action = scan.nextLine()
    println("Action is " + action)
    println("Please enter a number down below: ")
    val xArgument = scan.nextDouble()
    println("x = " + xArgument )
    println( "Please enter next number down below: ")
    val yArgument = scan.nextDouble()
    println("y = " + yArgument)


    if (action == "plus") {
      println(xArgument + " + " + yArgument + " = " + plus(xArgument, yArgument))
    } else if (action == "minus") {
      println(xArgument + " - " + yArgument + " = " + minus(xArgument, yArgument))
    } else if (action == "divide") {
      println(xArgument + " / " + yArgument + " = " + divide(xArgument, yArgument))
    } else  if(action == "multiple") {
      println(xArgument + " * " + yArgument + " = " + multiply(xArgument, yArgument))
    } else {
      println("Error: you didn't choose right action")
    }
  }

}
