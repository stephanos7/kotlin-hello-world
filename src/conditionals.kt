/**
 * Conditionals Upskilling
 *
 * */

fun main(args :Array<String>){

    println("hello from main")


    // conditionals()
    // whenFun()
    // ageGroupVar()
    whenAsIfElse()

}

fun conditionals():Unit {

    // print a range using for looping but skip 2 numbers

    // excluding 13
        for (i in 0 until 13 step 2) {
            println(i)
        }

    // whole range
        for (i in 0..13 step 2) {
            println(i)
        }

    // reverse order
        for (i in 13 downTo 0 step 2) {
            println(i)
        }
    println("hello from conditionals")
}


fun whenFun(){

    var userInput = ""

    while(userInput != "q"){
        println("user give me your number input or press q to quit ")
        userInput = readLine().orEmpty()

        when(userInput){
            "10" -> println("you got it right")
            "9"  -> println("almost!")
            "8"  -> println("getting close ...")
            else -> println("not even close")
        }

    }

    println("successful exit")

}

fun ageGroupVar(){

    val age = 10

    var ageGroup = when(age){
        in 0..2 -> "toddler"
        in 3..10 -> "child"
        in 11..17 -> "teenager"
        else -> "none"
    }

    println(ageGroup)
}

fun whenAsIfElse(){

    var num = 15


    // notice that when doesn't take any arguments to allow for a conditional expression to be evaluated
    val result = when {
        num % 3 == 0 && num % 5 == 0 -> "number divisible by both 3 and 5"
        num % 3 == 0 -> "number only divisible by 3"
        else -> "not part of experiment"
    }

    println(result)

}
