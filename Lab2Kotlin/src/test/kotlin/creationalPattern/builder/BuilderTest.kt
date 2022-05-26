package creationalPattern.builder

import creationalPattern.Work
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {

    @Test
    fun testEmployee1() {

        val name = "CJ Corona"
        val position = "Cadet Engineer"
        val company = "ABC Company"

        val work = Work.Builder().changeName(name)
            .changePosition(position)
            .changeCompany(company)
            .build()

        assertEquals(name, work.name())
        assertEquals(position, work.position())
        assertEquals(company, work.company())
    }

    @Test
    fun testEmployee2() {

        val name = "Regina Diloy"
        val position = "Cadet Engineer"
        val company = "XYZ Company"

        val work2 = Work.Builder().changeName(name)
            .changePosition(position)
            .changeCompany(company)
            .build()

        assertEquals(name, work2.name())
        assertEquals(position, work2.position())
        assertEquals(company, work2.company())
    }


}