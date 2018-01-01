package patternmatching

object MatchingPartialFunction {
  val matcher:PartialFunction[String,String] = {
      case "ping" => "pong"
  }
}