name := "PlayConcurrencyExample"
version := "1.0"
scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.8.18",
  "com.typesafe.play" %% "play-json" % "2.9.4",
  "com.typesafe.akka" %% "akka-stream" % "2.6.19"
)

enablePlugins(PlayScala)
