package functions

import java.util.Date

fun helloWorld() {
    println("hello world")
}

// "Kotlin" -> "K o t l i n"

fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

fun max(a:Int, b:Int): Int {
    if(a >= b){
        return a
    }else {
        return b
    }
}

fun getCurrentDate(): Date {
    return Date()
}

fun main(args: Array<String>) {
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(1, 10))
}