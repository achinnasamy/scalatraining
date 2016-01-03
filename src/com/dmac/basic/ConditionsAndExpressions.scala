package com.dmac.basic

object ConditionsAndExpressions {
  
  
  def main(array : Array[String]) {
  
    val countries = List("INDIA", "RUSSIA", "CUBA", "CHINA")
    
    val forLoop = new ForLoop

    //forLoop.printTheArray(countries)
    
    // If there is only one parameter passed, then it can be accessed by the below means
    val isPrinted = forLoop printTheArray countries
    forLoop.printIntegers()
    
    /***** if...else ****/
    if (isPrinted) 
      println("Printed the Countries")
    else
      println("Not printed any of those")
    
    
    println(printMeManyTimes)
    
    
    forLoop.forLoopWithBooleanExpression
  }
  
  
  
  def printMeManyTimes() : String = {
    return "*" * 100
  }
}


class ForLoop {
  
  
  def printTheArray(listOfCountries : List[String]) : Boolean = {
    
    for (country <- listOfCountries)
      println(country)
      
      false
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
  
  
  def forLoopWithBooleanExpression() {
    
    
    println("\n\n\n For Loop With Boolean Expressions")
    
    val authProperties = List ("AUA",
                               "ASA-Service Agency",
                               "TID",
                               "Version",
                               "UID",
                               "TXN",
                               "Encrypted-SKEY",
                               "Encrypted-SKEY-CertificateIdentifier",
                               "Data-Type",
                               "Data-Content-Encrypted-PID-XML",
                               "Encrypted-SKEY")
                               
    for (authElement <- authProperties if (authElement.startsWith("Data")))
      println(authElement)
      
  }
  
  
}