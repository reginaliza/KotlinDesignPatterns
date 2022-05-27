package behavioralPattern.state

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StateTest {

    val authorizationPresenter = AuthorizationPresenter()

    @Test
    fun testAdmin() {
        authorizationPresenter.loginUser("Admin")
        println(authorizationPresenter)
        assertTrue(authorizationPresenter.isAuthorized)
        assertEquals(authorizationPresenter.userName, "Admin")
    }

    @Test
    fun testUnknown() {
        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertFalse(authorizationPresenter.isAuthorized)
        assertEquals(authorizationPresenter.userName, "Unknown")
    }
}