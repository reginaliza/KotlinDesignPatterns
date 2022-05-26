package structuralPattern.facade

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FacadeTest {

    @Test
    fun testCJName() {
        val expected = "CJ Corona"
        val UserDetails = UserDetails()
        assertEquals(expected, UserDetails.namePrinter("CJ Corona"))
    }

    @Test
    fun testReginaName() {
        val expected = "Regina Diloy"
        val UserDetails = UserDetails()
        assertEquals(expected, UserDetails.namePrinter("Regina Diloy"))
    }

    @Test
    fun testManilaAddress() {
        val expected = "Manila"
        val UserDetails = UserDetails()
        assertEquals(expected, UserDetails.addressPrinter("Manila"))
    }



}