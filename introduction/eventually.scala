object Eventually {
    def main(args: Array[String]): Unit = {
        val xs = 1 to 3
        val it = xs.iterator
        it.foreach(e => println(e))
    }
}