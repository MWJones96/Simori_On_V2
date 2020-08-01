import tornadofx.*

class SimoriOnApp: App(MyView::class)

class MyView: View("SimoriON") {
    override val root = vbox {

        button("ON/OFF") {
            action {
                println("ON/OFF press")
            }
        }

        hbox {

            vbox {
                button("L1") {
                    action {
                        println("L1 press")
                    }
                }
                button("L2") {
                    action {
                        println("L2 press")
                    }
                }
                button("L3") {
                    action {
                        println("L3 press")
                    }
                }
                button("L4") {
                    action {
                        println("L4 press")
                    }
                }
            }

            gridpane {
                for (row_num in 0..15) {
                    row {
                        for (col_num in 0..15) {
                            button("") {
                                action {
                                    println("$row_num, $col_num grid press")
                                }
                            }.setPrefSize(32.0, 32.0)
                        }
                    }
                }
            }

            vbox {
                button("R1") {
                    action {
                        println("R1 press")
                    }
                }
                button("R2") {
                    action {
                        println("R2 press")
                    }
                }
                button("R3") {
                    action {
                        println("R3 press")
                    }
                }
                button("R4") {
                    action {
                        println("R4 press")
                    }
                }
            }
        }

        hbox {
            label("Display")
            button("OK") {
                action {
                    println("OK press")
                }
            }
        }
    }
}


fun main(args: Array<String>) {
    launch<SimoriOnApp>(args)
}