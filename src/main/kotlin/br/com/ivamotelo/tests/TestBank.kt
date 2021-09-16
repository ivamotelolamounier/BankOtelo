package br.com.ivamotelo.tests

import br.com.ivamotelo.Banks

fun main(){
    val bankOtelo = Banks(bankName = "Banco Otelo", bankNumber = 23)

    println("Banco nome: " + bankOtelo.bankName)
    println("Banco número: " + bankOtelo.bankNumber)

    var bank2Otelo = bankOtelo.copy(bankName = "Banco 2 Otelo", bankNumber = 25)

    println("Banco nome: " + bank2Otelo.bankName)
    println("Banco número: " + bank2Otelo.bankNumber)

    println(bank2Otelo.info())
}