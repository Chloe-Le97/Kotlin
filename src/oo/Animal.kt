package oo

open class Animal {
    private var age: Int = 0
    protected var name = "Sam"
    internal val isDangerous = true

//        get() = field
//        set(value){
//            if(value >= 0){
//                field = value
//            }
//        }

//    val name = ""
//        get() = field

    public fun isOld(param: String): Boolean {
        return age > 12
    }
}

class Vertebrate : Animal() {
    fun introduceYourself() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Animal()
//    animal.age = 8
//    animal.age = -2
    println()
}