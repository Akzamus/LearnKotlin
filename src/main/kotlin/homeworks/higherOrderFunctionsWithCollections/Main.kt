package homeworks.higherOrderFunctionsWithCollections

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val cookies = listOf(
                Cookie(
                    name = "Chocolate Chip",
                    softBaked = false,
                    hasFilling = false,
                    price = 1.69
                ),
                Cookie(
                    name = "Banana Walnut",
                    softBaked = true,
                    hasFilling = false,
                    price = 1.49
                ),
                Cookie(
                    name = "Vanilla Creme",
                    softBaked = false,
                    hasFilling = true,
                    price = 1.59
                ),
                Cookie(
                    name = "Chocolate Peanut Butter",
                    softBaked = false,
                    hasFilling = true,
                    price = 1.49
                ),
                Cookie(
                    name = "Snickerdoodle",
                    softBaked = true,
                    hasFilling = false,
                    price = 1.39
                ),
                Cookie(
                    name = "Blueberry Tart",
                    softBaked = true,
                    hasFilling = true,
                    price = 1.79
                ),
                Cookie(
                    name = "Sugar and Sprinkles",
                    softBaked = false,
                    hasFilling = false,
                    price = 1.39
                )
            )

            println("Full menu:")
            cookies
                .map { "${it.name} - $${it.price}" }
                .forEach(::println)

            println()

            val groupedMenu = cookies.groupBy { it.softBaked }
            val softBakedMenu = groupedMenu[true] ?: listOf()
            val crunchyMenu = groupedMenu[false] ?: listOf()

            println("Soft cookies:")
            softBakedMenu.forEach {
                println("${it.name} - $${it.price}")
            }

            println()

            println("Crunchy cookies:")
            crunchyMenu.forEach {
                println("${it.name} - $${it.price}")
            }

            println()

            println("Total price: $${cookies.sumOf { it.price }}")

            println()

            println("Alphabetical menu:")
            cookies
                .sortedBy { it.name }
                .map { "${it.name} - $${it.price}" }
                .forEach(::println)
        }

    }
}