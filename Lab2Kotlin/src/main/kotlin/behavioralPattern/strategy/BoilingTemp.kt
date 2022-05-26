package behavioralPattern.strategy

class BoilingTemp : Temperature {
    override fun getTemperature() : Int {
        println("Boiling point of water is 100 degrees Celsius")
        return 100
    }
}