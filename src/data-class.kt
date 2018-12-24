import javax.xml.crypto.Data

fun main(args :Array<String>){


    // normal classes
    val coordinates1 = Coordinates(94.3, 32.3)
    val coordinates2 = Coordinates(94.3, 32.3)

    val compareCoords = ::compareCoords

    println(compareCoords(coordinates1,coordinates2)) // false since despite sharing, data they are instantiated individually

    // data classes

    val dataCoordinate1 = DataCoordinates(3,7)
    val dataCoordinate2 = DataCoordinates(3,7)

    val compareDataCoords = ::compareDataCoords

    println("data classes: ")
    println(compareDataCoords(dataCoordinate1,dataCoordinate2)) // true because the have the same values
}

class Coordinates(var lat :Double, var long :Double){

}

data class DataCoordinates(var x :Int, var y :Int){

}

fun compareCoords(a :Coordinates, b :Coordinates): Boolean {
     return when{
        a == b -> true
        else -> false
    }
}

fun compareDataCoords(a :DataCoordinates, b :DataCoordinates) :Boolean{
    return when{
        a == b -> true
        else -> false
    }
}