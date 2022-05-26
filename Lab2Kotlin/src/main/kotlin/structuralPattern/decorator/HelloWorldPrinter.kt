package structuralPattern.decorator


interface MyPrinter {
    fun printedText() : String
}

class HelloPrinter : MyPrinter {
    override fun printedText() : String {
        return "Hello"
    }
}

class CommaPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()},"
    }
}

class SpacePrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()} "
    }
}

class WorldPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()}World"
    }
}

class ExclamationPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()}!"
    }
}