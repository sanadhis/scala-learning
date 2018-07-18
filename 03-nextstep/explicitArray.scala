val testArray: Array[String] = new Array[String](3) // new tells that we initiate the array with size

// OR

val testArray2: Array[String] = Array.fill(3)("")

val falseTestArray = Array[String](3.toString) // create array and init 3 as its only element

println(testArray.size)
println(testArray2.size)
println(falseTestArray.size)
