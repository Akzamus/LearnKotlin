package homeworks.classesAndCollections

data class Event (
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)