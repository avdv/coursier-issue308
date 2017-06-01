
organization := "test"
name := "c"

publishMavenStyle := false

allDependencies += organization.value %% "a" % "1.0.0" artifacts(Artifact("test", `type` = "info", extension = "csv")) intransitive()

lazy val checkCSV = taskKey[Boolean]("")

checkCSV := {
  val report = update.value
  val files = report.matching(artifactFilter(name = "test_2.*", `type` = "info", extension = "csv"))
  println("files: " + files.mkString(", "))

  files.nonEmpty
}
