package com.example.gabriel

fun main(){
    var continuar = true
    while(continuar){
        println("COntinuar?")
        continuar = readLine()!!.toLowerCase().equals("sim")
    }
    var valor : Int
    for(valor in 1..10)
        println(valor)
}