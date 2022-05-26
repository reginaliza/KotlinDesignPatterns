package structuralPattern.decorator

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorTest {

    @Test
    fun test() {
        val printer = ExclamationPrinter(
            WorldPrinter(
                SpacePrinter(
                    CommaPrinter(
                        HelloPrinter()
                    )
                )
            )
        )
        assertEquals("Hello, World!", printer.printedText())
    }
}