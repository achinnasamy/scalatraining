package com.dmac.basic

object ConditionsAndExpressions {
  
  
  def main(array : Array[String]) {
  
    val countries = List("INDIA", "RUSSIA", "CUBA", "CHINA")
    
    val forLoop = new ForLoop

    //forLoop.printTheArray(countries)
    
    // If there is only one parameter passed, then it can be accessed by the below means
    forLoop printTheArray countries
    
    
    forLoop.printIntegers()
  }
  
}


class ForLoop {
  
  
  def printTheArray(listOfCountries : List[String]) : Unit = {
    
    for (country <- listOfCountries)
      println(country)
  }
  
  
  def printIntegers() : Unit = {
    
    // Simple Loop
    for (i <- 1 to 10)
      println(i)
    
    // Nested Loop
    for {  i <- 1 to 10 
             j <- 1 to 10 }
      println(i, j)
      
      
  }
}