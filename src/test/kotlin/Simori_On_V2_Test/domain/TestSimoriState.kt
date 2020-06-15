package Simori_On_V2_Test.domain

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertEquals

import Simori_On_V2.domain.SimoriState

class TestSimoriState {
    @Test 
    fun testConstruction() {
        val simoriState: SimoriState = SimoriState()
        assertEquals(simoriState.dummy, 10, "All good!")
    }
}