package homeworks.practiceKotlinFundamentals

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    private val playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("${title}, performed by ${artist}, was released in ${yearPublished}.")
    }

}

fun main() {
    val song = Song(
        title = "Bohemian Rhapsody",
        artist = "Queen",
        yearPublished = 1975,
        playCount = 1200
    )

    println(song.printDescription())
    println(song.isPopular)
}