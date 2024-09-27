package id.ac.polbeng.mitha.test_kelas
//MITHA ZALINA RAMADHANY
//RPL 5A

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int

    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(){
    val budi = PersonD("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}