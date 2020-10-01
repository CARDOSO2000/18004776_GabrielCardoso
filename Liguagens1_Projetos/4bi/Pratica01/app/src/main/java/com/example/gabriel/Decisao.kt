package com.example.gabriel

fun main(){
    val valor = readLine()
    when(valor){
        "Murilo" -> println("Achei voce!")
        "Teste2" -> println("Noiss")
        else ->
            println("Carai")
    }
    when(valor!!.length){
        in 1..10 -> println("Ate 10")
        else -> println("LOL")
    }
}