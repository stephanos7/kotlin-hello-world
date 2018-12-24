/**
 *
 *
 * make a function to return the result of the division if whole else return null
 *
 * */


fun main( args :Array<String>){

    val checkResult = ::divideIfWhole

    println(checkResult(10,3))


}


fun divideIfWhole(number :Int, divisor: Int) :Int?{

    var result :Int?

    fun calculation() :Int {
     return number / divisor
    }

     result = when {
         number % divisor == 0 -> calculation()
         else ->  null
     }

    return result

}