package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

open class MyBase {
    open fun think () {
        println("Hey!! i am thinking ")
    }
}

class MyDerived: MyBase() {
    override fun think() {
        println("I Am from Child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}
