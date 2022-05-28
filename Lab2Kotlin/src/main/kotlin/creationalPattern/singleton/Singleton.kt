package creationalPattern.singleton

object PrinterDriver {
    init {
        println("Initializing with object: $this")
    }

    fun print(): PrinterDriver =
        apply {
            println("Printing with object: $this")
        }
}