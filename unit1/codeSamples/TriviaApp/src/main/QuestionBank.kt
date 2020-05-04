package main

data class QuestionBank(val category: String) {
    var questions = mutableListOf<Question>()

    init {
        questions = when (category) {
            "tv shows" -> getQuestionsForTvShows()
            else -> generalTrivia()
        }
    }

    private fun getQuestionsForTvShows(): MutableList<Question> {
        return mutableListOf(
            Question("What is the dog in family guy's name?", "Brian"),
            Question("What is Rick's last name?", "Sanchez"),
            Question("What drug does Heisenberg make?", "Meth")
        )
    }

    private fun generalTrivia(): MutableList<Question> {
        return mutableListOf(
            Question("What is the weather today?", "CatsNDogs"),
            Question("Where is Kotlin", "Russia")
        )
    }
}

class Question(val questionText: String, val answer: String)