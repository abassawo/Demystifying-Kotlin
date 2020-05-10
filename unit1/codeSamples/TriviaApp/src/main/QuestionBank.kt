package main

import com.google.gson.Gson
import java.io.File

data class QuestionBank(val category: String) {
    val pathToRickAndMortyQuestions = "/Users/abassbayo/Workspace/Curricula/Demystifying-Kotlin/unit1/codeSamples/TriviaApp/src/raw/rickandmorty.json"
    val pathToMusicQuestions = "/Users/abassbayo/Workspace/Curricula/Demystifying-Kotlin/unit1/codeSamples/TriviaApp/src/raw/musicquestions.json"
    var questions = mutableListOf<Question>()
    private val gson = Gson()

    init {
        questions = when (category) {
            "tv shows" -> getRickAndMortyQuestions()
            "music" -> getMusicQuestions()
            else -> getRickAndMortyQuestions() //todo - revert this just testing
        }
    }

    private fun getRickAndMortyQuestions(): MutableList<Question> = readFileInput(pathToRickAndMortyQuestions)

    private fun getMusicQuestions(): MutableList<Question> = readFileInput(pathToMusicQuestions)

    private fun readFileInput(filePath: String): MutableList<Question> {
        // todo - read from some json file with rick and morty questions
        val file = File(filePath) //file's constructor requires a filepath
        val jsonBodyAsString = file.readText()
        val questionsSet = gson.fromJson(jsonBodyAsString, QuestionsSet::class.java)
        return questionsSet.questions.toMutableList()

    }

    //todo - if question and enteredAnswer are equal return true
    // else return false
    fun checkAnswer(question: Question, enteredAnswer: String): Boolean =
            question.answer == enteredAnswer

}

class Question(val questionText: String, val answer: String) {
    override fun toString(): String {
        return this.questionText
    }
}

class QuestionsSet(val questions: List<Question>)