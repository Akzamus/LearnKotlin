package homeworks

fun main() {
    printMessages()
    fixCompileError()
    stringTemplates()
    stringConcatenation()
    messageFormatting()
    implementBasicMathOperations()
    defaultParameters()
    pedometer()
    compareTwoNumbers()
    moveDuplicateCodeIntoFunction()
}

fun printMessages() {
    println(
        """
        Use the val keyword when the value doesn't change. 
		Use the var keyword when the value can change.
		When you define a function, you define the parameters that can be passed to it. 
		When you call a function, you pass arguments for the parameters.
        """
    )
}

fun fixCompileError() {
    println("New chat message from a friend")
}

fun stringTemplates() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

fun stringConcatenation() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun messageFormatting() {
    val baseSalary = 5000
    val bonusAmount = 1000
    println(
        "Congratulations for your bonus! You will receive a " +
        "total of ${baseSalary + bonusAmount} (additional bonus)."
    )
}

fun implementBasicMathOperations() {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result: Int = add(firstNumber, secondNumber)
    var anotherResult: Int = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    result = subtract(firstNumber, secondNumber)
    anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun defaultParameters() {
    fun displayAlertMessage(emailId: String, operatingSystem: String = "UnknownOS") {
        println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
        println()
    }

    displayAlertMessage(
        emailId = "user_one@gmail.com"
    )

    displayAlertMessage(
        emailId = "user_two@gmail.com",
        operatingSystem = "Windows"
    )

    displayAlertMessage(
        emailId = "user_three@gmail.com",
        operatingSystem = "Mac OS"
    )
}

fun pedometer() {
    fun calculateCaloriesBurned(numberOfSteps: Int): Double {
        val caloriesBurnedForEachStep = 0.04
        return numberOfSteps * caloriesBurnedForEachStep
    }

    val steps = 4000
    val caloriesBurned = calculateCaloriesBurned(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun compareTwoNumbers() {
    fun compareTimeSpent(timeSpentToday: Int, timeSpentYesterday: Int) = timeSpentToday > timeSpentYesterday

    val timeSpentToday = 300
    val timeSpentYesterday = 250

    val result = compareTimeSpent(timeSpentToday, timeSpentYesterday)

    val message = if (result) {
        "You spent more time on your phone today than yesterday."
    } else {
        "You spent less or the same amount of time on your phone today compared to yesterday."
    }

    println(message)
}

fun moveDuplicateCodeIntoFunction() {
    fun printWeather(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
        println("City: $city")
        println("Low temperature: $lowTemp, High temperature: $highTemp")
        println("Chance of rain: $chanceOfRain%")
        println()
    }

    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)
}