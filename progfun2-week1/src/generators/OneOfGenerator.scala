package generators

import scala.util.Random

object OneOfGenerator {
  def generator[T](xs:T*) = new Generator[T] {
    def generate = xs(Random.nextInt(xs.size))
  }
}