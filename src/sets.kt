fun main(args :Array<String>){

    // SETS ONLY CONTAIN UNIQUE VALUES!!!


    val numbers = arrayOf(1,2,3,4,4,5,6,7)

    // FIRST, THE SPREAD OPERATOR IN KOTLIN is the Asterisk (*)
    val numbersSet = setOf<Int>(*numbers)

    // Notice how the double four (4) was not mapped to the set

    println(numbersSet)


    // creating a set and spreading the values of array in it has removed all duplicates
    // now a new array can be created by converting the set to an IntArray
    val duplicateFreeArray = numbersSet.toIntArray()

    for(i in 0 until duplicateFreeArray.size){
        println(duplicateFreeArray[i])
    }

}
