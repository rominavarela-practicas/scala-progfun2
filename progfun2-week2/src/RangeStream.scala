

object RangeStream {
  def apply(lo:Int, hi:Int):Stream[Int] = {
    if (lo >= hi) Stream.empty
    else lo #:: RangeStream(lo+1, hi) // same as Stream.cons(lo, RangeStream(lo+1, hi))
  }
}