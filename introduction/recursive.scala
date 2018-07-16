
object Recursive {

    // recursive does not work everytime!

    def recursion(x: Int) : Int = {
        if (x == 0){
            return 1
        }
        else{
            return 1 + recursion(x-1)
        }
    }

    // simple loops is better!

    def loop(x: Int): Int = {
        (1 to x).map(
            _ => 1
        ).sum
    }

    def main(args: Array[String]): Unit = {
        val x = scala.io.StdIn.readInt
        
        println(loop(x))
        println(recursion(x))
    }
}