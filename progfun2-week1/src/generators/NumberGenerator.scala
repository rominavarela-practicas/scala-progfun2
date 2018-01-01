package generators

import scala.util.Random

object NumberGenerator {
  def generator = new Generator[Int] {
    def generate = Random.nextInt()
  }
  
  def showcase() = {
    println("Number generator:")
    println()
    
    for {
      i <- generator
    } println(i)
  }
}