package loops

//fun main(args: Array<String>) {
//    var sum = 0
//    for (i in 1..10) {
//        sum = sum + i
//    }
//
//    println(sum)
//
//    val list = listOf("Jave", "Kotlin", "Python")
//    for (element in list) {
//        println(element)
//    }
//
//    for((index,value) in list.withIndex()) {
//        println("Element at $index is $value")
//    }
//}

//fun main(args: Array<String>) {
//    var x = 9
//
//    while (x >= 0) {
//        println(x)
//        x--
//    }
//}

//fun main(args: Array<String>) {
//    for (c in "Python") {
//        if(c=='o'){
//            break
//        }
//        println(c)
//    }
//
//    val list = listOf("Book","Table","Laptop")
//
//    for (str in list){
//        if(str.contains("o")){
//            //If text have o -> skip and move to next element
//            continue
//        }
//        println(str)
//    }
//}

fun main(args: Array<String>) {
    var sum = 0L
    for (i in 100..100000L){
        sum += i
    }
    println(sum)
}