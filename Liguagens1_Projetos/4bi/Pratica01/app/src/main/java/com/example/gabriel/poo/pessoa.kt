package com.example.gabriel.poo

class Pessoa(nome : String, cpf : String = "", email : String = ""){
    val nome:String
    val cpf:String
    val email:String

    init {
        this.nome = nome
        this.cpf = cpf
        this.email = email
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', cpf='$cpf', email='$email')"
    }


}