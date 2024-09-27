package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

// kelas parent
open class Computer(val name: String,
                    val brand: String) {
}

// kelas anak (inisialisasi parent class )
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}