package com.dmac.basic

object CollectionClasses {
  
  
  def main(args : Array[String] ) : Unit = {
  
    
    /*
     * ********************** List ********************************
      	List - Simple Immutable List
     */
    val aadhaarPktState = List("PKT_REJECTED", 
                                "PKT_DUPLICATE",
                                "PKT_BIOMETRIC_STAGE_ABIS")
                                
    println(aadhaarPktState(1))
    
    for(i <- aadhaarPktState)
      println(i)
    
      
    aadhaarPktState.map((c:String) => println(c.size))
      
    /*
     * ********************** Set ********************************
     	 Set is an immutable unordered collection of unique elements
     */
     
      /*
       		Simple store
       */
      val bufferStore = collection.mutable.Buffer
      
  }
  
  
}