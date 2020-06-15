package simori.domain

interface SimoriMode {
    val mode: Mode

    fun matrixCellInteract(state: SimoriState, coordPair: CoordinatePair)

    fun l1Interact(state: SimoriState)
    fun l2Interact(state: SimoriState)
    fun l3Interact(state: SimoriState)
    fun l4Interact(state: SimoriState)

    fun r1Interact(state: SimoriState)
    fun r2Interact(state: SimoriState)
    fun r3Interact(state: SimoriState)
    fun r4Interact(state: SimoriState)

    fun okInteract(state: SimoriState)
    fun onOffInteract(state: SimoriState)
}