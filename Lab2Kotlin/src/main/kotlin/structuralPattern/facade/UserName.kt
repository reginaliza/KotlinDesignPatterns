package structuralPattern.facade

class UserName {

    var name: String = ""
        set(value) {
            field = value
        }

    fun namePrinter() : String {
        println("Name: $name")
        return name
    }

}