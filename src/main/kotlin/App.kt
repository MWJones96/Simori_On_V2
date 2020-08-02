import tornadofx.*

class SimoriOnApp: App(MyView::class)

class MyView: View("SimoriON") {
    val simoriState: SimoriState = SimoriState()

    override val root = vbox {

        button("ON/OFF") {
            action {
                simoriState.OnOffPress()
            }
        }

        hbox {

            vbox {
                button("L1") {
                    action {
                        simoriState.L1Press()
                    }
                }
                button("L2") {
                    action {
                        simoriState.L2Press()
                    }
                }
                button("L3") {
                    action {
                        simoriState.L3Press()
                    }
                }
                button("L4") {
                    action {
                        simoriState.L4Press()
                    }
                }
            }

            gridpane {
                for (row_num in 0..15) {
                    row {
                        for (col_num in 0..15) {
                            button("") {
                                action {
                                    simoriState.GridPress(row_num, col_num)
                                }
                            }.setPrefSize(32.0, 32.0)
                        }
                    }
                }
            }

            vbox {
                button("R1") {
                    action {
                        simoriState.R1Press()
                    }
                }
                button("R2") {
                    action {
                        simoriState.R2Press()
                    }
                }
                button("R3") {
                    action {
                        simoriState.R3Press()
                    }
                }
                button("R4") {
                    action {
                        simoriState.R4Press()
                    }
                }
            }
        }

        hbox {
            label("Display")
            button("OK") {
                action {
                    simoriState.OKPress()
                }
            }
        }
    }
}


fun main(args: Array<String>) {
    launch<SimoriOnApp>(args)
}