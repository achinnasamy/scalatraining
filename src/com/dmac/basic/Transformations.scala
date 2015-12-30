package com.dmac.basic

object Transformations extends App {
  
  val zipTransformation = new ZipTransformation
  zipTransformation.doZip
  zipTransformation.doZipWithIndex
  zipTransformation.partitionMe
  
}


class ZipTransformation {
  
  def doZip() {

    val country = List("Austria", "Bahamas", "Cook Islands")
    val code = List("AT","BS","CK")
    
        
    val zippedList = code.zip(country)
    zippedList.foreach(x => println(x))
  }
  
  def doZipWithIndex() {
    
    val country = List("Austria", "Bahamas", "Cook Islands")
    val zippedList = country.zipWithIndex
    zippedList.foreach(x => println(x))
    
  }
  
  def partitionMe() {
    
    val countries = List("Brazil",
                       "Austria", 
                       "Bahamas",
                       "Bangladesh",
                       "Cook Islands")
    val partitionedList = countries.partition { country => country.startsWith("B") }
    partitionedList._1.foreach { x => println(x) }
    partitionedList._2.foreach { x => println(x) }
    
    
  }
}