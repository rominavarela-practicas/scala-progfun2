object Main extends App {
  def hr = println("\n----------\n")
  
  println("Streams")
  println()
  
  val x = 10234;
  val integersAfterX  = RangeStream(x,Int.MaxValue)
  def isPrime(n:Int) =
    if (n <= 1) {
      false
    }
    else !RangeStream(2, n-1).exists { dividend:Int =>
      n % dividend == 0
    }
  val firstPrime = integersAfterX.find(isPrime)
  
  println(s"Given all the integers after x=${x}, the first prime is: ${firstPrime}")
  
}