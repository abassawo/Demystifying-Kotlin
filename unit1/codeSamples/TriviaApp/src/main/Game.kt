package main

class Game(val userName: String) {

    fun startGame() {
        println("What category?")
        val category = readLine()
        introduceCategory(category!!)

        val questionBank = QuestionBank(category = category)
        askQuestions(questionBank)
    }

    private fun introduceCategory(category: String) {
        when (category) {
            "Tv shows" -> println("Alright $userName You picked tv shows!")
            "Music" -> {
                println("Alright $userName You picked music")
            }
            "Sports" -> {
                println("Alright $userName You picked sports")
            }
        }
    }

    private fun askQuestions(questionBank: QuestionBank) {
        val questions = questionBank.questions
        questions.forEach {
            println(it)  // Asking the question
            val enteredAnswer = readLine()  // Read and print the user's response
            questionBank.checkAnswer(it, enteredAnswer!!) // Check if it was correct don't do bang bangs but im doing it rn
            // todo - if they are correct, add 100 dollars to their account
        }
    }
}