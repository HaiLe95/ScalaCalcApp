package com.haile.app

import java.util.Scanner

object Main {

  def main(args: Array[String]): Unit = {

    val calc = new Calculator

    val scan = new Scanner(System.in)

    println("Please choose an action: plus, minus, divide or multiply")
    val action = scan.nextLine
    println("Action is " + action)

    println("Please enter a number down below: ")
    val xArgument = scan.nextDouble
    println("x = " + xArgument)

    println("Please enter next number down below: ")
    val yArgument = scan.nextDouble
    println("y = " + yArgument)


    action match {
      case "plus"     => println(xArgument + " + " + yArgument + " = " + calc.plus(xArgument, yArgument))
      case "minus"    => println(xArgument + " + " + yArgument + " = " + calc.minus(xArgument, yArgument))
      case "multiply" => println(xArgument + " * " + yArgument + " = " + calc.multiply(xArgument, yArgument))
      case "divide"   => println(xArgument + " / " + yArgument + " = " + calc.divide(xArgument, yArgument).get)
      case _          => println("Error: you didn't choose the right action")
    }

  }

}
