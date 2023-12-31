package homeworks.objectsAndClassInKotlinLab

class Main {

    companion object {
        
        @JvmStatic
        fun main(args: Array<String>) {
            val smartHome = SmartHome(
                SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment"),
                SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
            )

            smartHome.turnOnTv()
            smartHome.turnOnLight()
            println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
            println()

            smartHome.increaseTvVolume()
            smartHome.changeTvChannelToNext()
            smartHome.increaseLightBrightness()
            println()

            smartHome.turnOffAllDevices()
            println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
        }

    }

}