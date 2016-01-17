// import AssemblyKeys._




name := "SCALA-pi-workshop"

version := "1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.7"





// assemblySettings

// mainClass in assembly := Some("no.bekk.piworkshop.ScalaPi")

// jarName in assembly := "pi-workshop.jar"

// assembleArtifact in packageScala := true







libraryDependencies ++= Seq(
		    "com.pi4j" % "pi4j-core" % "1.0",
		    "com.pi4j" % "pi4j-service" % "1.0",
		    "com.pi4j" % "pi4j-gpio-extension" % "1.0",
		    "com.pi4j" % "pi4j-device" % "1.0"
)


