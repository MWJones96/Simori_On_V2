package Simori_On_V2.core

import Simori_On_V2.App

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Addtest {
    @Test fun testAddCorrect() {
        val addTest = Operator.Add(5)
        assertEquals(17, addTest.calculate(12))
    }
}