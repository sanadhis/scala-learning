// use method invocation!
val testArray: Array[String] = new Array[String](3)

testArray.update(0, "NL")
testArray.update(1, "PWD")
testArray.update(2, "IMSS")

// imperative yeay
for (i <- (0).until(testArray.size))
{
    println(testArray.apply(i))
}
