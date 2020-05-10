package main

fun main() {
    println("What's your name?")

    val enteredUserName = readLine()
    if (enteredUserName != null) {
        Game(userName = enteredUserName).startGame()
    }
}