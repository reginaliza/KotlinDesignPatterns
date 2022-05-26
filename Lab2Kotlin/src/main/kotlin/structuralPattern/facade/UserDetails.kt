package structuralPattern.facade

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