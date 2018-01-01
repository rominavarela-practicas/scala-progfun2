import patternmatching._
import generators._

object Main extends App {
  def hr = println("\n----------\n")
  
  println("Pattern Matching by Function")
  println()
  try {
    val matcher = MatchingFunction.matcher
    println("Matcher defined for 'ping':")
    println(matcher("ping"))
    println("Matcher defined for 'not this case':")
    println(matcher("not this case"))
  } catch {
    case e:Exception => {
      println("error: " + e.getMessage)
    }
  }
  
  hr
  
  println("Pattern Matching by Partial Function")
  println("- Trait PartialFunction[-A,+R]")
  println()
  try {
    val matcher = MatchingPartialFunction.matcher
    println("Matcher is defined at 'ping'?")
    println(matcher.isDefinedAt("ping"))
    println("Matcher is defined at 'not this case'?")
    println(matcher.isDefinedAt("not this case"))
  } catch {
    case e:Exception => {
      println("error: " + e.getMessage)
    }
  }
  
  hr
  
  println("Generators")
  
  println()
  println("Numbers:")
  for {
    i <- NumberGenerator.generator
  } println(i)
  
  println()
  println("Booleans:")
  for {
    i <- BooleanGenerator.generator
  } println(i)
  
  println()
  println("One of {a, e, i, o, u}:")
  val vowelGenerator = OneOfGenerator.generator('a','e','i','o','u')
  for {
    i <- vowelGenerator
  } println(i)
}