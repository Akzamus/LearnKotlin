package homeworks.practiceKotlinFundamentals

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.open()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}


open class Phone(
    var isScreenLightOn: Boolean = false
) {

    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }

}

class FoldablePhone(
    private var isOpen: Boolean = false
) : Phone() {

    override fun switchOn() {
        if(isOpen) {
            super.switchOn()
        }
    }

    fun open() {
        isOpen = true
    }

    fun close() {
        isOpen = false
        switchOff()
    }

}