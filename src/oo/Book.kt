//package oo
//
//class Book (val title: String, val author: String, val year: Int, var borrowed: Boolean){
//
//    fun borrowBook():Boolean{
//
//        if(borrowed == false){
//            borrowed = true
//            return true
//        }else {
//            println("Sorry, the book is already borrowed")
//            return false
//        }
//    }
//
//    fun returnBook():Boolean{
//       if(borrowed == true){
//           borrowed = false
//           return true
//       }else {
//           println("The book is not borrowed so it can not return, did you return my someone else book?")
//           return false
//       }
//    }
//}
//
//fun main(args: Array<String>) {
//    val peterPan = Book("Peter Pan - the never grow up boy", "Peter", 1990, false)
//
//    println(peterPan.title)
//    println(peterPan.author)
//    println(peterPan.year)
//    peterPan.borrowBook()
//    println(peterPan.borrowed)
//
//    val piranesi = Book("Piranesi", "Susanna Clarke", 2021, true)
//
//    println(piranesi.title)
//    println(piranesi.author)
//    println(piranesi.year)
//    println(piranesi.borrowed)
//    piranesi.borrowBook()
//    piranesi.returnBook()
//    println(piranesi.borrowed)
//
//}