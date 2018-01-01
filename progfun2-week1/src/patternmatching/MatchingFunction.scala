package patternmatching

object MatchingFunction {
  val matcher: (String => String) = {
    case "ping" => "pong"
  }
}