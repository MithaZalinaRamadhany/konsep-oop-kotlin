package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

interface A {
    fun demo() {
        println("From interface A")
    }
}

interface B {
    fun demo() {
        println("From interface B")
    }
}

class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}