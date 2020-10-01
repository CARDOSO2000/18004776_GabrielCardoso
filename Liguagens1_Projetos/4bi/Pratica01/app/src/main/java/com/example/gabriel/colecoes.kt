package com.example.gabriel

fun main(){
    val meuVetor = arrayOf(1,2,3)
    var item : Int
    for (item in meuVetor){
        println(item)
    }
    val minhaLista = listOf("Oi", "Ola", "denovo")
    println(minhaLista)

    val minhaListaQuemuda = mutableListOf("Ola", "oi")
    println(minhaListaQuemuda)
    minhaListaQuemuda.add("Gohan")
    println(minhaListaQuemuda)
}