// sbt build file

lazy val commonSettings = Seq(
  organization := "edu.berkeley.cs",
  name := "boom-template",
  version := "1.3",
  scalaVersion := "2.12.10",
  traceLevel := 15,
  scalacOptions ++= Seq("-deprecation","-unchecked","-Xsource:2.11"),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.1",
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
   resolvers ++= Seq(
     Resolver.sonatypeRepo("snapshots"),
     Resolver.sonatypeRepo("releases"),
     Resolver.mavenLocal))

// setup dependency tree
lazy val rocketchip = RootProject(file("rocket-chip"))
lazy val testchip = (project in file("testchipip")).settings(commonSettings).dependsOn(rocketchip)
lazy val boom = (project in file("riscv-boom")).settings(commonSettings).dependsOn(rocketchip, testchip)

// by default SBT sets the root project to ".", instead set the root to boom
onLoad in Global ~= (_ andThen ("project boom" :: _))
