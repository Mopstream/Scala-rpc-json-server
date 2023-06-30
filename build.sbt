ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "rpc-json"
  )

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.14.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.6" % Runtime
libraryDependencies += "com.github.dwickern" %% "scala-nameof" % "4.0.0" % "provided"

resolvers ++= Resolver.sonatypeOssRepos("snapshots")
libraryDependencies+="com.github.briandilley.jsonrpc4j"%"jsonrpc4j"%"1.6"
