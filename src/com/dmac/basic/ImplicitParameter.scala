package com.dmac.basic

object ImplicitParameter  extends App {
  
  implicit val key = "J763HyEHr7JD8THB33eG5H4JGE"
  
  val auth = new Auth
  auth.encryptDataUsingSessionKey("Authenticate my swipe with default")
}


class Auth {
  
  
  
  def encryptDataUsingSessionKey(bytes : String)(implicit sKey : String) = {
    println(s"$bytes key : $sKey")
  }
}