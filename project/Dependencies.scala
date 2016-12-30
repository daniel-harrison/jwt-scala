import sbt._

object Dependencies {
  object V {
    val play = "2.6.0"
    val playJson = "2.6.0-SNAPSHOT"
    val playSnapShot = "2.6.0-2016-12-26-6abe1e7-SNAPSHOT"
    val json4s = "3.5.0"
    val circe = "0.6.0"
    val scalatest = "3.0.0"
    val scalatestPlus = "2.0.0-M1"
    val jmockit = "1.24"
    val apacheCodec = "1.10"
    val bouncyCastle = "1.52"
  }

  object Libs {
    val play             = "com.typesafe.play" %% "play"      % V.playSnapShot % "provided"
    val playJson         = "com.typesafe.play" %% "play-json" % V.playJson % "provided"
    val playTest         = "com.typesafe.play" %% "play-test" % V.playSnapShot % "test"
    val playTestProvided = "com.typesafe.play" %% "play-test" % V.playSnapShot % "provided"

    val json4sCore    = "org.json4s" %% "json4s-core"    % V.json4s % "provided"
    val json4sNative  = "org.json4s" %% "json4s-native"  % V.json4s % "provided"
    val json4sJackson = "org.json4s" %% "json4s-jackson" % V.json4s % "provided"

    val circeCore     = "io.circe" %% "circe-core"    % V.circe
    val circeGeneric  = "io.circe" %% "circe-generic" % V.circe
    val circeParse    = "io.circe" %% "circe-parser"  % V.circe

    val apacheCodec = "commons-codec" % "commons-codec" % V.apacheCodec
    val bouncyCastle = "org.bouncycastle" % "bcpkix-jdk15on" % V.bouncyCastle

    val scalatest = "org.scalatest" %% "scalatest" % V.scalatest % "test"
//    val scalatestPlus = "org.scalatestplus.play" % "scalatestplus-play" % V.scalatestPlus % "test"
    val jmockit = "org.jmockit" % "jmockit" % V.jmockit % "test"
  }
}
