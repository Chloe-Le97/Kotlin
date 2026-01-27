package conditionals

import java.util.Random

//fun main(args: Array<String>) {
//    val mode: Int = 2
//
//    when (mode) {
//        1 -> println("The mode is lazy")
//        2 -> {
//            println("The mode is 2")
//            println("So the mode is busy")
//        }
//
//
//        3 -> println("The mode is 3")
//
//    }
//}

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1
    when(random){
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 11 and 20")
        in 21..30 -> println("x is between 21 and 30")
        in 31..40 -> println("x is between 31 and 40")

        else -> println("x is above 40")
    }

    println(random)
}