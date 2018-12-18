/**
  * Frontend build commands.
  * Change these if you are using some other package manager. i.e: Yarn
  */
object FrontendCommands {
  val packageManager = "npm"
  val dependencyInstall: String = packageManager + " install"
  val test: String = packageManager + " run test"
  val serve: String = packageManager + " run start"
  val build: String = packageManager + " run build"
}
