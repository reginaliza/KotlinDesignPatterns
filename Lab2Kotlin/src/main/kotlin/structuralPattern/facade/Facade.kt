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

class UserDetails {

    private var userAddress : UserAddress = UserAddress();
    private var userName : UserName = UserName();

    fun addressPrinter(address:String) : String {
        userAddress.address = address
        return userAddress.addressPrinter()
    }

    fun namePrinter(name:String) : String {
        userName.name = name
        return userName.namePrinter()
    }
}

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