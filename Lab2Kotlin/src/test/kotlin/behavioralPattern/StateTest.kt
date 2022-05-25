package behavioralPattern

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StateTest {

    @Test
    fun State() {
        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("Admin")
        println(authorizationPresenter)
        assertTrue(authorizationPresenter.isAuthorized)
        assertEquals(authorizationPresenter.userName, "Admin")

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertFalse(authorizationPresenter.isAuthorized)
        assertEquals(authorizationPresenter.userName, "Unknown")
    }
}