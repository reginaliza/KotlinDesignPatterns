package structuralPattern


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FacadeTest {

    @Test
    fun test() {
        val facade = Repository(LocalDataSource(), NetworkDataSource())
        val data = facade.fetch()
        assertEquals(listOf("Harry Potter", "Ronald Weasley", "Hermione Granger"), data)
    }
}