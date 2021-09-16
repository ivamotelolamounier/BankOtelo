package br.com.ivamotelo.tests
import br.com.ivamotelo.ClientType


fun main() {

    // manipulando o objeto diretamente
    ClientType.values().forEach { typeclient ->
        println(message = typeclient.name + " - " + typeclient.clientDescription)
    }

    ClientType.values().forEach {
        println(message = it.name +" - "+ it.clientDescription)
    }

    ClientType.values().forEach {
        println("${it.name} >> ${it.clientDescription}")
    }

    // Atribuindo o objeto a uma varíavel
    val pf = ClientType.PF
    println(pf.name + " - " + pf.clientDescription)

    val pj = ClientType.PJ
    println(pj.name + " - " + pj.clientDescription)
}