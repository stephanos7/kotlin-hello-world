/**
 *
 * Exercise to check if a number is prime
 *
 * */

fun main(args :Array<String>){

    val checkFunction = ::isPrime

    println(checkFunction(16))

}

fun isPrime(number :Int) :Boolean{
// notice how break can be used to break out of the loop if result is false


    var result = true
    // if prime ie 1,3,5,7,11
    for(i in 2..number/2){
        if(number % i == 0){
            result = false
            break
        }
        else{
            result = true
        }
    }
    return result

}