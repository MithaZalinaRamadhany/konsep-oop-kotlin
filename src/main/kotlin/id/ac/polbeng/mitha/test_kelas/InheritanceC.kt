package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

open class Teacher {
    // Harus menggunakan pengubah "terbuka" untuk mengizinkan kelas anak untuk menimpanya
    open fun teach() {
        println("Teaching...")
    }

    fun info(){
        println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher() {
    // Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}
