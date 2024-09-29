package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

open class NewPerson {
    open var age: Int = 1
}

class CheckedPerson: NewPerson(){
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}

fun main(args: Array<String>) {
    val person = NewPerson()
    person.age = -5 // Works

    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5 // Melempar IllegalArgumentException: Usia tidak boleh negatif
}
