package com.louis

/**
 *
 * @author jun.liu
 * @since 2021/2/19 11:01
 */
class Person(var firstName:String ,var lastName:String) {

  println("constructor begins")

  private val HOME=System.getProperty("user.home")

  var age=0

  override def toString: String = s"$firstName  $lastName is $age years old"

  def printHome(){ println(s"HOME=$HOME")}

  printHome()

}
