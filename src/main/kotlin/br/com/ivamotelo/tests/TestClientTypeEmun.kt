package br.com.ivamotelo.tests
import br.com.ivamotelo.CustomersTypes


fun main() {

    // manipulando o objeto diretamente
    CustomersTypes.values().forEach { typeclient ->
        println(message = typeclient.name + " - " + typeclient.clientDescription)
    }

    CustomersTypes.values().forEach {
        println(message = it.name +" - "+ it.clientDescription)
    }

    CustomersTypes.values().forEach {
        println("${it.name} >> ${it.clientDescription}")
    }

    // Atribuindo o objeto a uma varíavel
    val pf = CustomersTypes.PF
    println(pf.name + " - " + pf.clientDescription)

    val pj = CustomersTypes.PJ
    println(pj.name + " - " + pj.clientDescription)
}