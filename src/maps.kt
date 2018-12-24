

fun main(args :Array<String>){

    val airports = mutableMapOf("TAP" to "Toronto Airport", "NYA" to "New York Airport", "SAT" to "Seattle Airport")

    airports["LAR"] = "Larnaca Airport"

    println(airports)


    for((airportCode, airportName) in airports){
        println("the code $airportCode corresponds to $airportName")
    }

    // only the keys:

    for(code in airports.keys){
        println(code)
    }
}