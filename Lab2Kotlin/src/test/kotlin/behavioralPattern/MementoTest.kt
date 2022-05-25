package behavioralPattern

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MementoTest {

    @Test
    fun Memento() {
        val originator = Originator("initial state")
        val careTaker = CareTaker()
        careTaker.saveState(originator.createMemento())

        originator.state = "State #1"
        originator.state = "State #2"
        careTaker.saveState(originator.createMemento())

        originator.state = "State #3"
        println("Current State: " + originator.state)
        assertEquals((originator.state), "State #3")

        originator.restore(careTaker.restore(1))
        println("Second saved state: " + originator.state)
        assertEquals((originator.state), "State #2")

        originator.restore(careTaker.restore(0))
        println("First saved state: " + originator.state)
        assertEquals((originator.state),"initial state")
    }
}