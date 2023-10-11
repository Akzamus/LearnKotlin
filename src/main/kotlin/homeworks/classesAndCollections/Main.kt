package homeworks.classesAndCollections

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val events = mutableListOf(
                Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0),
                Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15),
                Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30),
                Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60),
                Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10),
                Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)
            )

            val shortEventNums = events
                .filter { it.durationInMinutes < 60 }
                .size

            println("You have $shortEventNums short events.")

            println()
            events
                .groupBy { it.dayPart }
                .forEach { (k, v) -> println("${k.name}: ${v.size} events") }

            println()
            println("Last event of the day: ${events.last().title}")

            println()
            println("Duration of first event of the day: ${events[0].durationOfEvent}")
        }

        private val Event.durationOfEvent
            get() = if (durationInMinutes < 60) "short" else "long"
    }

}
