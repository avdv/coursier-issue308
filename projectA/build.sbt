lazy val mkCSV = taskKey[File]("make a CSV file")

mkCSV := {
  val f = file("test.csv")
  IO.write(f, "-- header --")
  f
}

name := "a"
organization := "test"
version := "1.0.0"

publishMavenStyle := false

addArtifact(Artifact("test", "info", "csv"), mkCSV)
