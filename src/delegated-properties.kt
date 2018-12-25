import kotlin.properties.Delegates


fun main(args :Array<String>){

    val shirt123 = Shirt()
    shirt123.sold = true

    println(Shirt.totalSold)

}

class Shirt(){

    companion object {
        var totalSold = 0
    }

    var sold :Boolean by Delegates.observable(false){
        obj, old, new ->

        // weird parameters passed to the block, the object ref, the old (state?) and new (state?)
        // potentially useful for financial transactions where prev state matters

        if(new){
            totalSold++
        }
    }

}