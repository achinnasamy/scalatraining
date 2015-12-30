package com.dmac.basic

import scala.collection.mutable.ListBuffer

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
    
    
    val errorCodes = "200_OK" :: "404_BAD_REQUEST" :: "500_INTERNAL_SERVER_ERROR" :: "520_UNKNOWN_ERROR" :: Nil
    errorCodes.foreach { errorCode => println(errorCode)  }
    
    // List can also be of various data types
    val multiTypeList = List(500, "INTERNAL_SERVER_ERROR", true)
    
    var mutableList = new ListBuffer[Int]()
    mutableList += 1
    
    
    /*******************************************************************/
    
    /*
     * ********************** Set ********************************
     	 Set is an immutable unordered collection of unique elements
     */
     
      /*
       		Simple store
       */
      val bufferStore = collection.mutable.Buffer
   
    /*******************************************************************/
    // Tuple 
      
      val tupleStore = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,"17",18,19,20,21,22)
      println(tupleStore._22)
      
      val complexTuple = ("Insight into scala", 5, true)
      
    /*******************************************************************/
      
      
  }
  
  
}