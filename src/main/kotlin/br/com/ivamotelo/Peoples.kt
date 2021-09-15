package br.com.ivamotelo

class Peoples {

    var name : String = "Ivam"
    var cpf :  String = "123456789"
    private set

    inner class Adress {
        var adress : String = ""
        var number : String = ""
    }

}

fun main(){

    val pessoas = Peoples()
    var enderecos = Peoples().Adress().adress
    var numero = Peoples().Adress().number

    enderecos = "Avenida Principal"
    numero = "23"

    println("Nome: ${pessoas.name}")
    println("CPF nº: ${pessoas.cpf}")
    println("Endereço: ${enderecos}  " + "nº" + " ${numero}")
}