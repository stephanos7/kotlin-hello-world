fun main(args :Array<String>){


    val user123 = User.createUser("John", "Doe")

    println(User.totalNumberOfUsers)

    val seller234 = Seller("Business Vents")

    println(seller234.companyName)

}


class User private constructor(var first :String, var last :String){

    companion object Factory {

        var totalNumberOfUsers = 0

        fun createUser(first :String, last :String) :User{

            totalNumberOfUsers ++

            return User(first, last)

        }

    }

}


class Seller(var companyName: String){

    var name : String = companyName

}