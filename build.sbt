name := "Trial"

version := "1.0"

lazy val `Trial` = (project in file(".")).enablePlugins(PlayScala,PlayEbean,PlayJava)
scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

libraryDependencies += jdbc

libraryDependencies += evolutions

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"


