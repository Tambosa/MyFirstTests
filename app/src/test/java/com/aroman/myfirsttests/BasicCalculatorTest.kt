package com.aroman.myfirsttests

import org.junit.Assert
import org.junit.Test

class BasicCalculatorTest {
    private val calc = BasicCalculator

    @Test
    fun calculator_correctResult() {
        Assert.assertEquals(4, calc.divide(16, 4))
    }

    @Test
    fun calculator_correctResultNotThrowingException() {
        Assert.assertNotEquals(ArithmeticException(), calc.divide(20, 5))
    }

    @Test
    fun calculator_parameterAisZero_returnsZero() {
        Assert.assertEquals(0, calc.divide(0, 5))
    }

    @Test(expected = ArithmeticException::class)
    fun calculator_parameterBisZero_throwsException() {
        calc.divide(5, 0)
    }

    @Test
    fun calculator_returnInt() {
        val calc2 = BasicCalculator
        Assert.assertSame(calc, calc2)
    }

    @Test
    fun calculator_notNull() {
        Assert.assertNotNull(calc)
    }
}