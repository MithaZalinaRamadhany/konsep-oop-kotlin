package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }

    override fun funcY() {
        println("Hi")
    }
}

fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}

