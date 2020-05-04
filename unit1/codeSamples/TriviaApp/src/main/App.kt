package main

fun main() {

    println("What's your name?")
    val userName = readLine()

    if (userName != null) {
        Game(userName = userName).startGame()
    }
}