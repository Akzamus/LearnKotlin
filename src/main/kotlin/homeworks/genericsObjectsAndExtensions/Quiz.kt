package homeworks.genericsObjectsAndExtensions

class Quiz : ProgressPrintable {
    private val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    private val question2 = Question("The sky is green. True or false", false, Difficulty.EASY)
    private val question3 = Question("How many days are there between full moons?", 28, Difficulty.HARD)

    override val progressText: String
        get() = "$answered of $total answered"

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

    }

}