package estruturas

fun main(){
    val valor = 24
    if(valor > 10){
        print("Maior q dez \n")
    }
    when(valor){
        56 -> println("achei")
        in 1 .. 10 -> println("KKKKKKKKKK")
        valor % 2 -> println("Se fodex")
        else -> println("Fracassou")
    }
}