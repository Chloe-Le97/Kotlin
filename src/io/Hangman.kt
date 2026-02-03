package io

import kotlin.collections.mutableSetOf

fun main(args: Array<String>) {
    println("Enter the word to guess:")

    val word = readLine()
    if(word == null){
        println("No word given, game end")
    }

    for(i in 1..100){
        println('.')
    }

//    Tree
//    tree
//    ['t','r','e','e']
//    {'t','r','e'}
    val letters = word!!.lowercase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails= 0

//    while(letters!= correctGuesses){
//
//        for(i in word.lowercase().indices){
//            if(correctGuesses.contains(word.lowercase()[i])){
//                print(word.lowercase()[i])
//            }else{
//                print("_")
//            }
//        }
//
//        println("")
//        println("Guess the word:")
//        var guessWord: String? = readLine()
//
//        if (!guessWord.isNullOrEmpty()) {
//            val guessChar = guessWord[0].lowercaseChar()
//            if (guessChar in letters) {
//                correctGuesses.add(guessChar)
//            }else {
//                fails = fails + 1
//                println("You're wrong")
//                println("#Wrong guess: $fails\n\n")
//            }
//
//        }
//    }
//
//    if(letters == correctGuesses) {
//        println("Congratulations, the word is $word")
//    }
    while (letters != correctGuesses){
        printExploredWord(word, correctGuesses)
        println("#Wrong guess: $fails\n\n")

        print("Guess letter: ")
        val input = readLine()
        if(input == null){
            continue
        }else if(input.length != 1){
            println("Please enter one letter")
            continue
        }

        if(word.lowercase().contains(input.lowercase())){
            correctGuesses.add(input[0].lowercaseChar())
        }else {
            fails++
        }
    }
}

fun printExploredWord(word: String, correctGuesses: MutableSet<Char>){
    for(character in word.lowercase()){
        if(correctGuesses.contains(character)){
            print(character+ " ")
        }else {
            print("_")
        }
    }
}