import javafx.beans.binding.Bindings
import javafx.beans.binding.BooleanExpression
import javafx.beans.property.BooleanProperty
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.value.ObservableBooleanValue
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.geometry.Pos
import javafx.scene.Node
import tornadofx.*

class SimoriOnApp: App(MyView::class)

class MyView: View("SimoriON") {
    val simoriState: SimoriState = SimoriState()

    override val root = vbox {
        button("ON") {
            style = "-fx-background-radius: 256; margin: 100px;"
            action {
                simoriState.OnOffPress()
            }
        }.setPrefSize(48.0, 48.0)


        hbox {
            vbox {
                button("L1") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.L1Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("L2") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.L2Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("L3") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.L3Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("L4") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.L4Press()
                    }
                }.setPrefSize(48.0, 48.0)
            }

            gridpane {
                for (row_num in 0..15) {
                    row {
                        for (col_num in 0..15) {
                            val gridButton = button("") {
                                style = "-fx-background-radius: 256;"
                                action {
                                    simoriState.GridPress(row_num, col_num)
                                }
                            }

                            gridButton.setPrefSize(32.0, 32.0)
                            gridButton.bind(SimpleBooleanProperty(simoriState.display[row_num][col_num]))
                        }
                    }
                }
            }

            vbox {
                button("R1") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.R1Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("R2") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.R2Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("R3") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.R3Press()
                    }
                }.setPrefSize(48.0, 48.0)
                button("R4") {
                    style = "-fx-background-radius: 256;"
                    action {
                        simoriState.R4Press()
                    }
                }.setPrefSize(48.0, 48.0)
            }
        }

        hbox {
            label("Display")
            button("OK") {
                style = "-fx-background-radius: 256;"
                action {
                    simoriState.OKPress()
                }
            }.setPrefSize(48.0, 48.0)
        }
    }
}


fun main(args: Array<String>) {
    launch<SimoriOnApp>(args)
}