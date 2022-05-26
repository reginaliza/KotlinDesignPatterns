package structuralPattern.facade

class UserAddress {

    var address: String = ""
        set(value) {
            field = value
        }

    fun addressPrinter() : String {
        println("City: $address")
        return address
    }


}