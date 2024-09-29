package id.ac.polbeng.mitha.test_kelas
// MITHA ZALINA RAMADHANY
// RPL 5A

open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println(nama + '\n' + nrp)
    }

    override fun toString(): String { // Use 'override' keyword here
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    @Override
    override fun info() {
        println(nama + '\n' + nrp + '\n' + jurusan)
    }

    override fun toString(): String { // Override the toString method for KetuaHima
        return "KetuaHima{nama= $nama, nrp= $nrp, jurusan= $jurusan}"
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")
    println(anton.toString())

    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)

    println()
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)

    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}
