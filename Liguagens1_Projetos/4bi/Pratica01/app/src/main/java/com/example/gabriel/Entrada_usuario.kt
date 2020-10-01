package com.example.gabriel

fun main(){
    println("Informe um nome")
    var nome = readLine()
    println("Ola $nome")
    println("Informe 2 numeros")
    val numero1 = readLine()!!.toDouble()
    val numero2 = readLine()!!.toDouble()
    println("Resultado de $numero1 e $numero2 é ${numero1+numero2}" )
    //ELVIS
    var nome2 : String?
    nome2 = "Miguel"
    println(nome2)
    nome2 = null
    println("${nome2 ?: "Ryu"}")

}