fun main(args :Array<String>){


    // first customer
    val customer123 = Customer("John", "Doe")

    customer123.fistName = "Mike"

    println(customer123.fullName)

    //    customer123.fullName = "Mary Doe"     > cannot be reassigned, only a getter, readonly val

    // second customer
    val customer456 = customer123

    println(customer456.fistName) // Notice how second customer is pointing to the same Customer INSTANCE as the first customer

    // this is proven by the triple equality sign. In kotlin, triple equality is used to check against the same referenced INSTANCE

    println(customer123 === customer456)


    // third customer
    val customer789 = Customer("George", "Doe")

    println(customer789 === customer123) // not pointing to the same instance of Customer(John, Doe) but to Customer(George, Doe)
}


class Customer(var fistName :String, var lastName :String){

    // build getters as constants (val) with a get() method below.
    // if var is used instead it will ask you to initialise, i.e. to define a set() instead
    val fullName
        get() = "$fistName $lastName"

}