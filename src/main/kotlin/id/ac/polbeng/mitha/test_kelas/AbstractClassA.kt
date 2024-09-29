package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) {

    // Abstract Property (Harus ditimpa oleh Subkelas)
    abstract var maxSpeed: Double

    // Abstract Methods (Harus diimplementasikan oleh Subkelas)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        // Kode untuk menyalakan Mobil
        println("Car Started")
    }

    override fun stop() {
        // Kode untuk menstop Mobil
        println("Car Stopped")
    }

    override fun sound() {
        // Kode suara mobil
        println("Brum...brum...brumm!")
    }
}

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        // Kode untuk menyalakan sepeda motor
        println("Bike Started")
    }

    override fun stop() {
        // Kode untuk menstop sepeda motor
        println("Bike Stopped")
    }

    override fun sound() {
        // Kode suara mobil
        println("Preng...preng...preng!")
    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    car.displayDetails()
    motorCycle.displayDetails()

    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}

