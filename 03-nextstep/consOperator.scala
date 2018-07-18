// cons operator = "::"
// belongs to Int class
// should be followed by Nil to indicate the end of the list (for Int)

val x = 1
val y = 28
val z = List[Int](27,4)

println(x :: y :: Nil)

println(y :: x :: Nil)

println(y :: z) // prepending => FAST!

println(z :+ y) // appending => SLOW!
