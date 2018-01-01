package generators

import scala.util.Random

object BooleanGenerator {
  def generator = new Generator[Boolean] {
    def generate = (Random.nextInt() % 2) == 0
  }
}