package com.louis

/**
 *
 * @author Louis
 * @date created on 2021/2/21
 *       description: 
 */
class PlayWithPets {

  val dogs=Array(new Dog("Rover"),new Dog("Comet"))

  def workWithPets(pets:Array[Pet]):Unit={}

  /**
   * todo
   * 如果我们统一都是用泛型的方式，那么这里是支持协变的
   * @param pets
   * @tparam T
   */
  def workWithPets2[T<:Pet](pets:Array[T]):Unit={
    print("playing with pets:"+pets.mkString(","))

  }

  def copyPets[S,D>:S](fromPets:Array[S],toPets:Array[D])={

  }
  val pets=new Array[Pet](10)

  copyPets(dogs,pets)

//  workWithPets(dogs)
  workWithPets2(dogs)

}
