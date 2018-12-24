fun main(args :Array<String>){

    // 1. first the structure is declared
    val additionLambda : (Int, Int) -> Int = { a , b -> a + b }

    // 2. then the function body is defined based on the structure

    // 3. the function is passed or executed
    println(additionLambda(3,3))


    println(maths(3,4, additionLambda))


    // 4. if the lambda only has one argument, it can be used and can also be defined directly

//    val squareLambda : (Int)


}

fun maths(firstNum :Int, secondNum :Int, operation: (Int, Int) -> Int) :Int{

    return operation(firstNum, secondNum)

}