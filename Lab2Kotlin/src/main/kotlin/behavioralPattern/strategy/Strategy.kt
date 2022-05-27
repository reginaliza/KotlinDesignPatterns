package behavioralPattern.strategy

fun main() {

    var tempConvert : Temperature = BoilingTemp();
    println("Setting temperature to: ${tempConvert.getTemperature()}" );

}

class BoilingTemp : Temperature {
    override fun getTemperature() : Int {
        println("Boiling point of water is 100 degrees Celsius")
        return 100
    }
}

interface Temperature {

    fun getTemperature (): Int

}