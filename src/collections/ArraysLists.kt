package collections

//fun main(args: Array<String>) {
////    array can not add or remove element
//    val array = arrayOf("Texas", "Iowa","California")
//    // list cannot add or remove element
//    val list = listOf("Orange","Apple","Bannanas")
////    array list can add or remove element
//    val arrayList = arrayListOf("Patrick","Michael","Sarah")
//
//    arrayList.remove("Patrick")
//    arrayList.add("Apple")
//
//    println(arrayList)
//}

//fun main(args: Array<String>) {
//    val array = arrayOf("Texas", "Iowa","California")
//    val mixed = arrayOf("Kotlin", 17, 3.0, false)
//    val numbers = intArrayOf(1, 2, 3, 4, 5)
//
//    println(mixed[0])
//    mixed[2] = 3.1415
//    println(mixed[2])
//
//    val str = "Udemy"
//    println(str[0])
//
//    val states = arrayOf("Nevada", "Florida")
//    val allStates = array + states
//
//    println(allStates.size)
//
//    val empty: Boolean = numbers.isEmpty()
//    println(empty)
//
//    if (states.contains("Kentucky")){
//        println("It contains Kentucky")
//    }else {
//        println("It does not contain Kentucky")
//    }
//}

fun main(args: Array<String>) {
    val arrayList = arrayListOf("one", "two", "three", "four")
    val list = arrayListOf<String>("five",  "six")

    println(list)
    println(arrayList + list)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("four"))

    arrayList.add("eleven")
    arrayList.add(1, "twelve")
    println(arrayList)

    arrayList.remove("four")
    println(arrayList)
}