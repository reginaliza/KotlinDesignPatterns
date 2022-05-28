package behavioralPattern.strategy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test


class StrategyTest {


    @Test
    fun testTempManila(){
        val expected = 29
        var temperature:Temperature = TempManila()
        assertEquals(expected, temperature.getTemperature())
    }

    @Test
    fun testTempKorea(){
        val expected = 24
        var temperature:Temperature = TempKorea()
        assertEquals(expected, temperature.getTemperature())
    }

    @Test
    fun testNewYork(){
        val expected = 18
        var temperature:Temperature = TempNewYork()
        assertEquals(expected, temperature.getTemperature())
    }

}