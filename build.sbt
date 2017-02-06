name := "PxRest"

version := "1.0"

scalaVersion := "2.12.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
resolvers += "spray nightlies repo" at "http://nightlies.spray.io"




libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.4.16",
    "com.typesafe.akka" %% "akka-remote" % "2.4.16",
    "com.typesafe.akka" %% "akka-http-core" % "10.0.0",
    "com.typesafe.akka" %% "akka-http" % "10.0.0"
  )
