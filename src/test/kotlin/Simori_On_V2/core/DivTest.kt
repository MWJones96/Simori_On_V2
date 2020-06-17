package Simori_On_V2.core

import Simori_On_V2.App

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DivTest {
    @Test fun testDivCorrect() {
        val divTest = Operator.Div(35)
        assertEquals(5, divTest.calculate(7))
    }
}