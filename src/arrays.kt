fun main(args :Array<String>){


    // notice how strings can also be included
    val numbers = arrayOf(1,2,3,4,5,7, "hello")
    // you can also use Array() to initialize: Array(5, "person 1")



    // integer array
    val explicitNumbers = intArrayOf(1,2,4)



    // interesting use of "until". no need to worry about size(length) - 1. Until excludes the last index
    for(i in 0 until numbers.size){
        println(numbers[i])
    }



    // LISTS -> DIFFERENT FROM ARRAYS.
    // Lists cannot be mutate BY DEFAULT!

    val names = listOf("Alex", "John", "Mary")

    // List TYPE:
    val members :List<String> = listOf()                // OPTION 1
    val otherMembers          = listOf<String>()        // OPTION 2

    val membersNonExclusive   = mutableListOf<String>("alex","mike") // MUTABLE LIST!!!

    membersNonExclusive.add("George") // [alex, mike, george]
    membersNonExclusive.add("Nick")
    membersNonExclusive.add("Emma")


    membersNonExclusive.last() // George

    membersNonExclusive.slice(1..3) // NOTICE THE RANGE!!! NOT TWO ARGS LIKE JS

    // NOTICE HOW SLICE DOESN'T MUTATE THE ORIGINAL LIST
    println(membersNonExclusive)


    // AMAZING FUNCTIONALITY:
    // check if a value is in the list

    if("alex" in membersNonExclusive) println("yes he is in")

    // OR TO get a Boolean:
    println(membersNonExclusive.contains("alex"))

    // easy custom contains funcs:
    fun contains1(name :String, names:List<String>) :Boolean{
        return name in names
    }

    fun contains2(name: String, names:List<String>) :Boolean{
        return names.contains(name)
    }

    println(contains1("alex", membersNonExclusive))
    println(contains2("jose", membersNonExclusive))
}