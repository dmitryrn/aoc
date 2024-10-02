ThisBuild / scalaVersion := "3.5.1"
ThisBuild / organization := "com.example"

fork := true

lazy val hello = project
  .in(file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "toolkit-test" % "0.1.7" % Test,
      "org.scala-lang" %% "toolkit" % "0.1.7",
    )
  )
