package pl.dsw.baism

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Local JUnit unit tests. These run in the `safe_build` workflow on Bitrise;
 * if any assertion fails, the CI/CD pipeline stops and the build is marked red.
 */
class CalculatorTest {

    @Test
    fun add_returnsSum() {
        assertEquals(5, Calculator.add(2, 2))
        assertEquals(0, Calculator.add(-5, 5))
    }

    @Test
    fun subtract_returnsDifference() {
        assertEquals(1, Calculator.subtract(3, 2))
    }

    @Test
    fun multiply_returnsProduct() {
        assertEquals(12, Calculator.multiply(3, 4))
    }

    @Test
    fun divide_returnsQuotient() {
        assertEquals(5, Calculator.divide(10, 2))
    }

    @Test(expected = IllegalArgumentException::class)
    fun divide_byZero_throws() {
        Calculator.divide(1, 0)
    }

    @Test
    fun isEven_detectsParity() {
        assertTrue(Calculator.isEven(4))
        assertFalse(Calculator.isEven(7))
    }
}
