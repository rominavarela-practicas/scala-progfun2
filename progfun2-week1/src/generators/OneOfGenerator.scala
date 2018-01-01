package generators

import scala.util.Random

object OneOfGenerator {
  def generator[T](xs:T*) = new Generator[T] {
    def generate = xs(Random.nextInt(xs.size))
  }
  
  def showcase() = {
    println("One of generator (given the vowels):")
    println()
    
    val vowelGenerator = generator('a','e','i','o','u')
    for {
      i <- vowelGenerator
    } println(i)
  }
}