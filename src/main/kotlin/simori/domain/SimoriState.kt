package simori.domain

class SimoriState {
    val simoriLayers = List(16) { Layer() }

    init {
        initialize()
    }

    fun initialize() {
    }
}