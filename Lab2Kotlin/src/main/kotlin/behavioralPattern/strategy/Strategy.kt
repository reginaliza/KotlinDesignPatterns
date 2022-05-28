package behavioralPattern.strategy

fun main() {
    var temp : Temperature = TempManila();
    println("Temperature now in Manila is: ${temp.getTemperature()}" );

    var temp2 : Temperature = TempKorea();
    println("Temperature now in Korea is: ${temp.getTemperature()}" );

    var temp3 : Temperature = TempNewYork();
    println("Temperature now in New York is: ${temp.getTemperature()}" );

}

class TempManila : Temperature {
    override fun getTemperature() : Int {
        println("The temperature now in Manila is 29 degrees Celsius")
        return 29
    }
}

class TempKorea : Temperature {
    override fun getTemperature() : Int {
        println("The temperature now in Korea is 24 degrees Celsius")
        return 24
    }
}

class TempNewYork : Temperature {
    override fun getTemperature() : Int {
        println("The temperature now in Korea is 18 degrees Celsius")
        return 18
    }
}

interface Temperature {

    fun getTemperature (): Int

}