class SimoriState {
    val currentLayer = 0
    val simoriMode: SimoriMode = SimoriMode()

    fun GridPress(row: Int, col: Int) {
        println("($row, $col) press")
    }

    fun OnOffPress() {
        println("On/Off press")
    }

    fun OKPress() {
        println("OK press")
    }

    fun L1Press() {
        println("L1 press")
    }

    fun L2Press() {
        println("L2 press")
    }

    fun L3Press() {
        println("L3 press")
    }

    fun L4Press() {
        println("L4 press")
    }

    fun R1Press() {
        println("R1 press")
    }

    fun R2Press() {
        println("R2 press")
    }

    fun R3Press() {
        println("R3 press")
    }

    fun R4Press() {
        println("R4 press")
    }
}