/**
 * Functions in Kotlin
 *
 * */

fun main(args :Array<String>){

    // greet("Mary")

    // variables pointing to functions
    var funcVar = ::greet
    funcVar("Jason")

    var addFunction = ::add
    var divideFunction = ::divide

    doSomeMath(addFunction, 4,5)
    doMoreMath(divideFunction, 3.0,9.0)

}


// passing a fun to a fun - the function data type is the essentially the structure of the function contract
// "addition" is the function argument passed to the function doSomeMath.
// "addition" is of type function. Type function is essentially the structure of the allowed function passed as argument
// in this case (Int,Int)->Int means that only functions that satisfy this structure can be passed
// i.e functions which take 2 integers and return and integer (notice with -> not :)
// then the second and third arguments passed to function doSomeMath are named firstNumber and secondNumber being indeed type Int



fun doSomeMath( addition :(Int,Int) -> Int, firstNumber :Int, secondNumber :Int){  //

    val res = addition(firstNumber,secondNumber)
    println(res)
}

fun doMoreMath( division :(Double,Double) -> Double, numberToDivide :Double, numberToDivideBy :Double ){
    val res = division(numberToDivide, numberToDivideBy)
    println(res)
}

fun divide(a: Double, b:Double) :Double{
    return a / b
}

fun add(a :Int, b :Int) :Int {
    return a + b
}


fun greet(name :String){

    // name cannot be re assigned, each argument is a val
    // i.e. name = "John" will not work

    println("hello $name")
}

