package behavioralPattern.template

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TemplateTest {

    @Test
    fun testSunAndMoon() {
        val music: Music = WesternMusic()
        val expected : String = "Sun and Moon"
        assertEquals(expected, music.myMusic())
    }

    @Test
    fun testPagsamo() {
        val music: Music = PinoyMusic()
        val expected : String = "Pagsamo"
        assertEquals(expected, music.myMusic())
    }
}