package com.dmac.basic

object ImplicitFeature {
  
  
  def printAge(name : String) {
    println(s"printing age of $name")
  }
  
  implicit def printName(age : Int) : String = {
    println("obtaining name")
    "CHINNASAMY"
  }
  
  /* Two implicit functions cannot be possible
  implicit def getName(age: Int) : String = {
    ""
  } */
  
  def main(args: Array[String]) {
    printAge(12)
  }
  
}