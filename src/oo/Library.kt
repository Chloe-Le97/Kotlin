package oo

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(var title:String, var genre: String, var publicationYear: Int, var borrowed: Boolean): Lendable{
    override fun borrow() {
        if(!borrowed){
            borrowed = true
        }else{
            println("This item is already borrowed!")
        }
    }
}

class Books(title: String, genre: String, publicationYear: Int, author: String, borrowed: Boolean): InventoryItem(title, genre, publicationYear, borrowed ), Lendable {

}

//class DVD(var title: String, genre: String, publicationYear: Int, length: Double): InventoryItem{
//
//}

fun main(args: Array<String>) {
    val book = Books(title="Piranesi", genre = "comics", publicationYear = 1997, author="Susana Clark", borrowed = true)
    println(book.borrowed)
    book.borrow()

    println(book.borrowed)
}