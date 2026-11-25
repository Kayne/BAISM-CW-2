package pl.dsw.baism

/**
 * Pure business logic with no Android dependencies, so it can be covered
 * by fast local unit tests that run on the JVM in CI.
 */
object Calculator {

    fun add(a: Int, b: Int): Int = a + b

    fun subtract(a: Int, b: Int): Int = a - b

    fun multiply(a: Int, b: Int): Int = a * b

    /** @throws IllegalArgumentException when [b] is zero. */
    fun divide(a: Int, b: Int): Int {
        require(b != 0) { "Division by zero is not allowed" }
        return a / b
    }

    fun isEven(n: Int): Boolean = n % 2 == 0
}
