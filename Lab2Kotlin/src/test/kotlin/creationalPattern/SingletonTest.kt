package creationalPattern

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun Singleton() {
        println("Start")
        val printerFirst = PrinterDriver.print()
        val printerSecond = PrinterDriver.print()

        assertEquals(printerFirst, PrinterDriver)
        assertEquals(printerSecond, PrinterDriver)
    }

}