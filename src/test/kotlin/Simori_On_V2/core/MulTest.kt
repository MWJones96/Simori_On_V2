package Simori_On_V2.core

import Simori_On_V2.App

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class MulTest {
    @Test fun testMulCorrect() {
        val mulTest = Operator.Mul(10)
        assertEquals(50, mulTest.calculate(5))
    }
}