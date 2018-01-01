package generators

import scala.util.Random

object BooleanGenerator {
  def generator = new Generator[Boolean] {
    def generate = (Random.nextInt() % 2) == 0
  }
  
  def showcase() = {
    println("Boolean generator:")
    println()
    
    for {
      i <- generator
    } println(i)
  }
}