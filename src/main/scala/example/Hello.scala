package example

object Hello extends Greeting with App {
  val x = superLongMethodToTestForHover("a", "b", "c", "d", "e", "f", "g")
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"

  /**
      * There is also a lot stuff written here to make the float bigger.
      * Blah blah blah blah blah blah
      *
      * @param a
      * @param b
      * @param c
      * @param d
      * @param e
      * @param f
      * @param g
      */
  def superLongMethodToTestForHover(
      a: String,
      b: String,
      c: String,
      d: String,
      e: String,
      f: String,
      g: String
  ) = ()

  superLongMethodToTestForHover("a", "b", "c", "d", "e", "f", "g")

  val enterNewlineAfterPipe = """|""".stripMargin

}
