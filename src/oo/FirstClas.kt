package oo

//class Person {
//    var name: String = "Sarah"
//    var age: Int = 42
//
//    fun speak(){
//        println("Hello")
//    }
//
//    fun greet(name: String){
//        println("Hello $name")
//    }
//
////    fun getYearOfBirth(): Int{
////        return 2025 - age
////    }
//    fun getYearOfBirth() = 2025 - age
//}
//
//fun main(args: Array<String>) {
//    var person = Person()
//
//    person.speak()
//    println(person.getYearOfBirth())
//    println(person.name)
//    println(person.age)
//}

abstract class Person (open val name: String, open var age: Int) {
    var birthYear = 2025 - age

    init {
        println("Object was created")
    }

    abstract fun speak()

    fun greet(name: String){
        println("Hello $name")
    }

//    fun getYearOfBirth(): Int{
//        return 2025 - age
//    }
    fun getYearOfBirth() = 2025 - age
}

class Student(override val name: String, override var age: Int, val studentID: Long): Person(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("I'm a student $studentID")
    }
}

class Employee(override val name: String, override var age: Int): Person(name, age) {
    fun recievedPayment(){
        println("Recieved Payment")
    }
    override fun speak() {
        println("Hi I'm employee")
    }
}

fun main(args: Array<String>) {
    val student = Student("John", 18, studentID = 12348574)
    student.speak()
    println(student.isIntelligent())

    val employee = Employee("Johnny", 48)
    println(employee.getYearOfBirth())
    employee.recievedPayment()
    employee.speak()

}