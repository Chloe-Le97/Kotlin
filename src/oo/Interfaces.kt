package oo

interface Drivaeable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color) : Drivaeable, Buildable {
    override val timeRequired = 120
    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Building a shiny car...")
    }
}

class Motobike(val color: Color) : Drivaeable {
    override fun drive() {
        println("Driving motobike...")
    }
}

fun main(args: Array<String>) {
    val car = Car(Color.BLUE)
    print(car.color)
    car.drive()
    val motocycle: Drivaeable = Motobike(Color.GREEN)
    motocycle.drive()
}