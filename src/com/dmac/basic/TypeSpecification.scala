package com.dmac.basic

object TypeSpecification {
  
  
  
  def main(args : Array[String]) {
    
   val aInteger :  TypeAlias.MY_INTEGER = 5
   val aString : TypeAlias.myString = "Zeus"
   
   val empBean : TypeAlias.EMPBEAN = new EmployeeBean
    
  }
}

/**
 * Type Alias
 */
object TypeAlias {
  
  type MY_INTEGER = Int
  type myString = String
  type RT = Runtime
  type EMPBEAN = EmployeeBean
  
 
}


/**
 *   Abstract Type
 **/
class AbstractTypeElucidation[Parent] {
  
  
}
