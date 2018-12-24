/**
 *
 *
 * make a function to return the result of the division if whole else return null
 *
 * */


fun main( args :Array<String>){

    val checkResultFirstWay = ::divideIfWholeOne
    val checkResultSecondWay = ::divideIfWholeTwo

    println(checkResultFirstWay(10,3))

    println(checkResultSecondWay(9,3))


}


fun divideIfWholeOne(number :Int, divisor: Int) :Int? {

    var result: Int?

    fun calculation(): Int {
        return number / divisor
    }

    result = when {
        number % divisor == 0 -> calculation()
        else -> null
    }

    return result
}

fun divideIfWholeTwo(number :Int, divisor: Int) :Int?{

    val quotient = number / divisor
    val remainder = number % divisor

    // notice the single line if conditional. First return is needed explicitly to return the function but the conditional doesn't need explicit returns in the one-liner
    return if(remainder == 0) quotient else null
}


