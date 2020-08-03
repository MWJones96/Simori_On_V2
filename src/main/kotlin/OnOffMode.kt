class OnOffMode: SimoriMode {
    override fun GridPress(simoriState: SimoriState, row: Int, col: Int) {
        println("Mode: ON/OFF, Button: Grid $row $col")
    }

    override fun OnOffPress(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: ON/OFF")

        println("Switching to Performance Mode")
        simoriState.switchMode(PerformanceMode())
    }

    override fun OKPress(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: OK")
    }

    override fun L1Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: L1")
    }

    override fun L2Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: L2")
    }

    override fun L3Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: L3")
    }

    override fun L4Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: L4")
    }

    override fun R1Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: R1")
    }

    override fun R2Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: R2")
    }

    override fun R3Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: R3")
    }

    override fun R4Press(simoriState: SimoriState) {
        println("Mode: ON/OFF, Button: R4")
    }
}