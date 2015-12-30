package com.dmac.basic

import sys.process._

object ExecuteExternalCommand extends App {
  
  val LS_COMMAND = "ls -l" !!
  
  println(LS_COMMAND)
}