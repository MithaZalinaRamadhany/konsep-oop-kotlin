package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}

interface Polygon {
    fun draw() {
        println("From interface Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw() // memanggil Rectangle.draw()
        super<Polygon>.draw() // memanggil Polygon.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}
