import javafx.scene.paint.Color
import tornadofx.*

class Styles: Stylesheet() {
    companion object {
        val gridButtonOn by cssclass()
        val modeButtonOn by cssclass()
    }

    init {
        gridButtonOn {
            backgroundColor += c("#ffffff")
        }

        modeButtonOn {
            backgroundRadius = multi(box(100.percent))
            borderRadius = multi(box(100.percent))
            borderColor += box(c("darkgrey"))
            backgroundColor += c("#ffffff")
        }
    }
}