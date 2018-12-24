/**
 *
 * Safely calling and checking nulls without if statements
 *
 * */

fun main( args :Array<String>){

    var phrase :String? = "hello world"
    val normalType :String = "yo"

    // safe calling takes a ? at the end of the variable and can be chained
    val lengthOfPhrase = phrase?.length
    // very important to note that lengthOfPhrase will now also be of nullable type!!!!!!

    // BUT!!!!

    // Using   let   ,you can:
    //                          1. use      it     as reference to the variable
    //                          2. assign to a var with normal type


    // incorrect
    phrase.let {
        // notice that if you don't use ? the .let still creates a nullable-string scope
    }

    // correct implementation:
    phrase?.let {

        // fixed variable type
        println(phrase.javaClass.name)

        // fixed length of var type
        val lengthOfPhraseWithRightType = it.length

        // fixed type
        println(lengthOfPhraseWithRightType.javaClass.name)


        println(it)
    }

}