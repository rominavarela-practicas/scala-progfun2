package patternmatching

object MatchingPartialFunction {
  val matcher:PartialFunction[String,String] = {
      case "ping" => "pong"
  }
  
  def showcase() {
    println("Pattern Matching by Partial Function Example")
    println("- Trait PartialFunction[-A,+R]")
    println()
    try {
      println("Matcher is defined for 'ping':")
      println(matcher.isDefinedAt("ping"))
      println("Matcher is defined for 'not this case':")
      println(matcher.isDefinedAt("not this case"))
    } catch {
      case e:Exception => {
        println("error: " + e.getMessage)
      }
    }
  }
}