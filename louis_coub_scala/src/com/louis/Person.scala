package com.louis

import scala.beans.BeanProperty

/**
 *
 * @author jun.liu
 * @since 2021/2/19 11:01
 */
class Person(var firstName:String ,var lastName:String) {

  println("constructor begins")

  private val HOME=System.getProperty("user.home")

  /**
   * 变量在使用前必须是被初始化了
   */
  @BeanProperty var position:String=_

  def this(firstName:String,lastName:String,positionHeld:String){
    this(firstName,lastName)
    position=positionHeld

  }

  var age=0

  override def toString: String = s"$firstName  $lastName is $age years old"

  def printHome(){ println(s"HOME=$HOME")}

  printHome()

}
