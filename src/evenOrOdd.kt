import com.sun.org.apache.xpath.internal.operations.Bool

/**
 *
 * exerice if number is even or odd
 *
 * */

fun main( args :Array<String>){

    val checkResult = ::evenOrOdd

    println(checkResult(4))

}

fun evenOrOdd(number :Int) :Boolean {

    return when {
        number % 2 == 0 -> true
        else -> false
    }

}