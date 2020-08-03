interface SimoriMode {
    fun GridPress(simoriState: SimoriState, row: Int, col: Int)
    fun OnOffPress(simoriState: SimoriState)
    fun OKPress(simoriState: SimoriState)
    fun L1Press(simoriState: SimoriState)
    fun L2Press(simoriState: SimoriState)
    fun L3Press(simoriState: SimoriState)
    fun L4Press(simoriState: SimoriState)
    fun R1Press(simoriState: SimoriState)
    fun R2Press(simoriState: SimoriState)
    fun R3Press(simoriState: SimoriState)
    fun R4Press(simoriState: SimoriState)
}