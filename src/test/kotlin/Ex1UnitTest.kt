import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class Ex1UnitTest {

    @Before
    @Throws(Exception::class)
    fun setUp() {
        println("Before ")
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        println("After ")
    }

    @Test
    fun equalString() {
        println("Je developpeur Mobile")
        val str1 = "Je developpeur Mobile"
        assertEquals("Je developpeur Mobile", str1)
    }

}