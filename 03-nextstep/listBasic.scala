// implicit assignment
val list1 = List[Int](1,2,3)
val list2 = List[Int](2,4,6)

// list is immutable, create new list instead of changing
val list3 = list1 ::: list2

println(list3)
