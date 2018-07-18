// args.zipWithIndex.foreach( (arg1: String, arg2: Int)  => {
//     println(arg2 + " : " + arg1)
// })

// functional way
args.zipWithIndex.foreach( arg => {
    println(arg._2 + " : " + arg._1)
})

// imperative style
for (arg <- args)
    println(arg) // -> this is val