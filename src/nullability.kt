/**
 *
 * explore kotlin's nullability
 *
 * */


fun main(args :Array<String>){

    var age :Int?

    // good example with input forms
    var middleName :String?

    // can parse a string into int or nullible if not represented as a number, i.e when string is "ten" instead of "10"
    val parsedInt = "10".toIntOrNull()
    val parsedIntButNull = "ten".toIntOrNull() // could not be parsed into a number thus null

    age = 10

    println(age)
    println(parsedInt)
    println(parsedIntButNull)

    println("managing null types : ")

    var number :Int? = 5 // will accept only Int or Null but it's neither int nor null type, it's Nullible with Int tendencies
    var properNumber :Int = 9
    println(5)

    // number ++  this is not allowed since the type is not really Int but actually Int? which is the nullible type and we cannot add or subtract to null
    println(null + 123) // for example null + 1 becomes null123 (Wtf)

    //to release the value from it's nullible box use !! while this will unwrap number from nullible to int, it's not recommended
    number = number!! + 1

    // number is still able to accept null, but has been released from its nullible box. Contrary, proper number is of type Int not Int? and cannot later accept null
    // properNumber = null
    println(number)



}

