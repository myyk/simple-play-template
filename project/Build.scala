import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "simple-play-template"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here
    jdbc,
    anorm,
    "com.github.twitter" % "bootstrap" % "2.0.2",

    // Add your test dependencies here
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    resolvers += "webjars" at "http://webjars.github.com/m2"
  )

}
