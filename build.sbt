name := """ProyectoYamilet"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"
enablePlugins(PlayEbean)
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
 "mysql" % "mysql-connector-java" % "5.1.+",
  evolutions,
  javaWs
)


    
