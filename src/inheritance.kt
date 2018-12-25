


fun main(args :Array<String>){

    val car123 = BMW(2004, "520")

    println(car123.start())

}
// class must be open to inheritance using the keyword open.
// similarly, each parent method must be initialised with the open keyword to allow for override.
// (inheritance of the method seems to work without the open declaration but override doesn't)

open class Car( var year :Int, var model :String) {

    open fun start(){
        println("Car ignition")
    }

}

// returning the parent instance Car as part of the contract executes inheritance

class BMW(year :Int, model :String) :Car(year, model) {

    override fun start(){
        println("BMW Start")
    }

}