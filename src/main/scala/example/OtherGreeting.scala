package example

trait OtherGreeting extends Greeting {
  
  override lazy val greeting: String = "other hello"

}
