package oo

enum class Color(val rgb: Int) {
    RED(0xF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
    println(0b1111111 == 0xFF)
}