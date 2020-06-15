package test.domain

import simori.domain.SimoriState
import kotlin.test.*

class TestSimoriState {
    @Test 
    fun testSimoriNotNull() {
        val simoriState: SimoriState = SimoriState()
        assertNotNull(simoriState, "SimoriState instance should not be null")
    }
}