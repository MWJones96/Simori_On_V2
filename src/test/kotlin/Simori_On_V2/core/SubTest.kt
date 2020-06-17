package Simori_On_V2.core

import Simori_On_V2.App

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SubTest {
    @Test fun testSubCorrect() {
        val subTest = Operator.Sub(100)
        assertEquals(93, subTest.calculate(7))
    }
}