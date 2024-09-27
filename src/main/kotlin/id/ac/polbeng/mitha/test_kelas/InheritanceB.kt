package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

// class anak (inisialisasi kelas induk)
class LaptopB : Computer{
    val batteryLife: Double

    // pemanggilan super() untuk inisialisasi kelas induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }

    // Calls constructor lainnya (yang memanggil super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }

    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}
