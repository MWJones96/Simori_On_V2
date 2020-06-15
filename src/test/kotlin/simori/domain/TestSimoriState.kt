package test.domain

import simori.domain.SimoriState
import kotlin.test.*

class TestSimoriState {
    @Test 
    fun testConstruction() {
        val simoriState: SimoriState = SimoriState()
        assertEquals(simoriState.dummy, 10, "All good!")
    }
}