class SimoriState {
    var currentLayer = 0
    var simoriMode: SimoriMode = OnOffMode()
    var display: Array<BooleanArray> = Array(16) { BooleanArray(16) }

    fun switchMode(simoriMode: SimoriMode) {
        this.simoriMode = simoriMode
    }

    fun resetDisplay() {
        for (row in 0..15) {
            for (col in 0..15) {
                display[row][col] = false
            }
        }
    }

    fun GridPress(row: Int, col: Int) {
        simoriMode.GridPress(this, row, col)
    }

    fun OnOffPress() {
        simoriMode.OnOffPress(this)
    }

    fun OKPress() {
        simoriMode.OKPress(this)
    }

    fun L1Press() {
        simoriMode.L1Press(this)
    }

    fun L2Press() {
        simoriMode.L2Press(this)
    }

    fun L3Press() {
        simoriMode.L3Press(this)
    }

    fun L4Press() {
        simoriMode.L4Press(this)
    }

    fun R1Press() {
        simoriMode.R1Press(this)
    }

    fun R2Press() {
        simoriMode.R2Press(this)
    }

    fun R3Press() {
        simoriMode.R3Press(this)
    }

    fun R4Press() {
        simoriMode.R4Press(this)
    }
}