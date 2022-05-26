package creationalPattern.singleton

import creationalPattern.PrinterDriver
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun Singleton() {
        val printerFirst = PrinterDriver.print()
        val printerSecond = PrinterDriver.print()

        assertEquals(printerFirst, PrinterDriver)
        assertEquals(printerSecond, PrinterDriver)
    }

}