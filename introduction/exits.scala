// Scala is high-level

object Exists{
    def main(args: Array[String]):Unit = {
        val name = scala.io.StdIn.readLine
        if (name.exists(_.isUpper))
            println("True")
        else
            println("False")
    }
}