fun main(args :Array<String>){

    // consider using "direction" instead of index to make more sense for the Compass context
    // ORDINAL IS ACTUALLY THE INDEX OF THE VALUE!!


    for(direction in Compass.values()){
        println(direction.ordinal)
        println(direction.name)
    }

}

// ENUM CLASSES HOLD "values"
// the values (In this case the 4 directions) have an ORDINAL which is the index, and a NAME which the enum name

enum class Compass {
    North,
    South,
    West,
    East
}