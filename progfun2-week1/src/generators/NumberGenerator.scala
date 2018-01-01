package generators

import scala.util.Random

object NumberGenerator {
  val generator = new Generator[Int] {
    def generate = Random.nextInt()
  }
}