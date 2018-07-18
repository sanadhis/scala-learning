# Chapter 3
Some next steps into Scala

# Points
* Scala val will point to the same object (allocation in memory). But the object to which it refers to could potentially still be changed. Ex: Array allocation is immutable but the array element itself is mutable.
* No operator overloading in Scala -> Operators can be used as method names.
* Array access is apply (method) access -> parentheses instead of square brackets.
* Scala array (likely) equals to Java array, meanwhile Scala's List isn't.
* List is immutable (implemented with linked list), array is the opposite.
* Cons operator (::) for prepending (works with Integer data type).
* List: Prepending (::) > Appending (:+). [Reference](https://stackoverflow.com/questions/32839619/scala-append-and-prepend-method-performance). Solution: ListBuffer (later chapter)
* Method that ends with colon is executed to right operand (mind blowing).
