name := "spark_dbscan"

organization := "org.alitouka"

version := "0.0.5"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1" % "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0-M8" % "test"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += Resolver.sonatypeRepo("public")

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds",
  "-Xlint",
  //"-Xfatal-warnings",
  "-Xexperimental",
  "-Ybackend:GenBCode",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)
