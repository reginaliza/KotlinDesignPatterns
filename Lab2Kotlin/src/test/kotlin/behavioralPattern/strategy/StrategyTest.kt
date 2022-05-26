package behavioralPattern.strategy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test


class StrategyTest {

    @Test
    fun testTemp100(){
        val expected = 100
        var temperature:Temperature = BoilingTemp()
        assertEquals(expected, temperature.getTemperature())
    }

}