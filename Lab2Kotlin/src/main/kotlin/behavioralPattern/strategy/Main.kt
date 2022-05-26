package behavioralPattern.strategy

fun main() {

    var tempConvert : Temperature = BoilingTemp();
    println("Setting temperature to: ${tempConvert.getTemperature()}" );

}