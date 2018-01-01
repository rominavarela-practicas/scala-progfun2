import patternmatching._
import generators._

object Main extends App {
  def hr = println("\n----------\n")
  
  MatchingFunction.showcase()
  
  hr
  
  MatchingPartialFunction.showcase()
  
  hr
  
  NumberGenerator.showcase()
  
  hr
  
  BooleanGenerator.showcase()
  
  hr
  
  OneOfGenerator.showcase()
}