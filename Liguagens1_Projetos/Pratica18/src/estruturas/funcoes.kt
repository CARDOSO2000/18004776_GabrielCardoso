package estruturas
fun somar(numero1 : Int, numero2 : Int) = numero1 + numero2
fun somar2(numero1 : Int = 5, numero2 : Int = 6) = numero1 + numero2

fun main(){
    val a = 1
    val b = 2
    println("Soma: ${somar(a,b)}")
    println("${somar2()}")
}