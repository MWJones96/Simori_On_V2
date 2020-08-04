class PerformanceMode: SimoriMode {
    override fun GridPress(simoriState: SimoriState, row: Int, col: Int) {
        println("Mode: Performance, Button: Grid $row $col")

        simoriState.display[row][col] = !simoriState.display[row][col]

        val gridStateString = if (simoriState.display[row][col]) "ON" else "OFF"
        println("Turning $row $col $gridStateString")
    }

    override fun OnOffPress(simoriState: SimoriState) {
        println("Mode: Performance, Button: ON/OFF")

        println("Switching to ON/OFF mode")
        simoriState.resetDisplay()
        simoriState.switchMode(OnOffMode())
    }

    override fun OKPress(simoriState: SimoriState) {
        println("Mode: Performance, Button: OK")
    }

    override fun L1Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: L1")
    }

    override fun L2Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: L2")
    }

    override fun L3Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: L3")
    }

    override fun L4Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: L4")
    }

    override fun R1Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: R1")
    }

    override fun R2Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: R2")
    }

    override fun R3Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: R3")
    }

    override fun R4Press(simoriState: SimoriState) {
        println("Mode: Performance, Button: R4")
    }
}