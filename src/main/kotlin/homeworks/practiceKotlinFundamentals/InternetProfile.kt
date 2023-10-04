package homeworks.practiceKotlinFundamentals

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(
    private val name: String,
    private val age: Int,
    private val hobby: String?,
    private val referrer: Person?
) {
    
    fun showProfile() {
        val hobbyInfo= hobby?.let { "Likes to $it." }
            ?: "Doesn't have a hobby."
        val referrerInfo = referrer?.let { "Has a referrer named ${it.name}, who likes to ${it.hobby}." }
            ?: "Doesn't have a referrer."

        println(
            """
            Name: $name
            Age: $age
            $hobbyInfo $referrerInfo
            
            """.trimIndent()
        )
    }

}
