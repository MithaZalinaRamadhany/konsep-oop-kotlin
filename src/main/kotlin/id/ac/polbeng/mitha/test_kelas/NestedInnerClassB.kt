package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

fun main() {
    var programmer: Human = object : Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}