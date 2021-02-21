package com.louis

/**
 *
 * @author Louis
 * @date created on 2021/2/21
 *       description: 
 */
class Pet (val name:String){

  override def toString: String = name
}

class Dog(override val name:String ) extends Pet(name)
{

}







