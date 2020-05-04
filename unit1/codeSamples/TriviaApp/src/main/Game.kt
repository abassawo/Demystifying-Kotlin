package main

class Game(val userName: String) {

    fun startGame() {
        val category = "Tv shows"
        introduceCategory(category)

        val questionBank = QuestionBank(category = "Tv shows")
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
        // todo - ask all the questions.
    }
}