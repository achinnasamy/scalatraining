name := "ScalaTraining"
 
version := "1.0"
 
scalaVersion := "2.11.7"
 
libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5",
                            "org.slf4j" % "slf4j-simple" % "1.7.5")
                           
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.0"
 
resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
resolvers += "Maven Repository" at "http://repo1.maven.org/maven2"