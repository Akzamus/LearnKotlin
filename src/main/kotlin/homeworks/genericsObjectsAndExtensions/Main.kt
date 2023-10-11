package homeworks.genericsObjectsAndExtensions

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            Quiz().apply {
                printQuiz()
                printProgressBar()
            }
        }

    }

}
