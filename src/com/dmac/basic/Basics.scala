package com.dmac.basic

import javax.swing.{ JFrame => MyAppFrame }


object Basics {
  
  /**
   * A Simple Scala Method
   */
  def scalaMethod(empName:String, empDepartment : String) : Int = {
    return 1001
  }
  
  def main(args : Array[String]) {
    
    /** Scala has a built in type-inference mechanism. The compiler
     		deduces the type from the initialization expression of the variable.
     **/
    val twelve = 3 + 9 
    val assignMe = "Assign Me"
    val assignMeNil = Nil
    val assignMeNull = null
    
    
    
    println(twelve.isValidInt)
    println(assignMe)
    
    println(assignMeNil)
    println(assignMeNull)    
    /****************************************************/
    
    
    /****************************************************/
    // Re-naming a class while at import is allowed
    // import javax.swing.{ JFrame => MyAppFrame }
    val myFrame = new MyAppFrame
    myFrame.show(true)
    /****************************************************/
    
    // Import inside a code block is permitted. 
    // But validity of the import is allowed with in the code block
    import javax.swing.JPanel
    val panel = new JPanel
    
    myFrame.add(panel)
    
  }
}