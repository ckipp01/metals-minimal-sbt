package example

object Hello extends Greeting with App {
  val x = superLongMethodToTestForHover("a", "b", "c", "d", "e", "f", "g")
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"

  def superLongMethodToTestForHover(
      a: String,
      b: String,
      c: String,
      d: String,
      e: String,
      f: String,
      g: String
  ) = ()

  val enterNewlineAfterPipe = """|""".stripMargin

}
