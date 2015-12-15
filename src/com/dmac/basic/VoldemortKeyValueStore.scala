package com.dmac.basic


class VoldemortKeyValueStore extends KeyValueStoreTrait {
  
  def get() : String = {
    return ""
  }
  
   def put(value : Any) : Boolean = {
     
     
     val recordInserted = true
     println(value)
     return recordInserted
   }
  
  
   override def dataStoreName(): String = {
      return "VOLDEMORT"
  }
}