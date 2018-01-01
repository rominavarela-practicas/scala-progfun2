package patternmatching

object MatchingFunction {
  val matcher:(String => String) = {
    case "ping" => "pong"
  }
  
  def showcase() {
    println("Pattern Matching by Function Example")
    println()
    try {
      println("Matcher defined for 'ping':")
      println(matcher("ping"))
      println("Matcher defined for 'not this case':")
      println(matcher("not this case"))
    } catch {
      case e:Exception => {
        println("error: " + e.getMessage)
      }
    }
  }
}