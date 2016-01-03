package com.dmac.basic

object HighConstructor extends App {
 
  val oc = ObjectClass("Richard_Stallman")
  println(oc.getNameOfObject)
}

class HighClass(name : String, id: Int) {
  
  
  def this(name: String) {
   this("", 11)  
  }
  
  def this() {
    this("")  
  }
  
}

/****************************************************************************/
// Create a constructor for the object class

class ObjectClass {
  
  private var objectName = ""
  
  def getNameOfObject() : String = {
    objectName
  }
}

object ObjectClass {
  
  def apply(name : String) : ObjectClass = {
    var objectClass = new ObjectClass
    objectClass.objectName = name
    objectClass
  }
}
/****************************************************************************/