package com.dmac.basic

object ScalaMethods {
  
  
  
  def main(args : Array[String]) {
    val methodClass = new MethodClass
    println(methodClass.++("ARAVINDH "))
    println(methodClass ++ "ARAVINDH " )
    
    methodClass printAll
  }
  
  
  
  
}

class MethodClass {
  
  /**
   		A Simple Function
   */
  def methodName(variableName : String) : Unit = {
    
  }
  
  /**
   * 
   */
  def printAll {
    
    println("The noble prize of computer science : ")
    println("Turing award")
  }
  
  
  /**
   * Methods names can be of symbols
   */
  def + (key : String, value : String) : String  = {
     key.concat(value)
  }
  
  def ++ (input : String) : String = {
    input.concat(input)
  }
  
  def +*-%^& (input : String) : String = {
    ""
  }
  
  /**
   
  		A Higher Order Function
  	
   */
  
  
  /**
   		A Partial Order Function
   */
  
  
  
  /**  
   		Currying Functions
   */
  
}