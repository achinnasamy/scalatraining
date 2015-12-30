package com.dmac.basic

object FileOperations extends App {
  
  val fileOperations = new FileOperations
  //fileOperations.readFile("D:/ac/data/auth.txt")
  fileOperations.readCSVFile("D:/ac/data/auth.txt")
}


class FileOperations {
  
  /**
   * Simple file read and printing it
   */
  def readFile(fileName: String) : Unit = {
    
    val file = io.Source.fromFile(fileName)
  
    for(line <- file.getLines())
      println(line)
      
    file.close
  }
  
  
  def readCSVFile(fileName: String) : Unit = {
    
    val csvFile = io.Source.fromFile(fileName)
  
    for(line <- csvFile.getLines()) {
        val columns = line.split(",")
        println(columns(0))
    }
    
    csvFile.close
  }
}