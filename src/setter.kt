import kotlin.math.sqrt

fun main(args :Array<String>){


    var redSquare = Square(4.0)

    println(redSquare.width)
    println(redSquare.area)

    redSquare.area = 16.0

    println("with setter : ")
    println(redSquare.area)

}

// DO NOT FORGET VAR IN FRONT OF ARGUMENTS

class Square(var width :Double){

    var area :Double
        get(){
            return width * width
        }
        set(number){
            width = sqrt(number)
        }
}