fun main(args :Array<String>){

   val customer123 = Client("John", "Doe")

    CustomerRepository.addCustomer(customer123)


    for(i in 0 until CustomerRepository.all.size){
        println(CustomerRepository.all[i])
    }

}

data class Client(var firstName :String, var lastName :String){

}

object CustomerRepository {

    val all = mutableListOf<Client>()

    fun addCustomer(customer :Client){
        all.add(customer)
    }

}