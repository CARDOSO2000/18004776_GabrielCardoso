package oo

class Animal(val nome: String, var peso : Double) {
    override fun toString(): String {
        return "Animal(nome='$nome', peso='$peso')"
    }
}
fun main(){
    val animal1 = Animal("Fido", 34.0)
    println(animal1)
}
