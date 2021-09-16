package br.com.ivamotelo

abstract class Peoples (
    open val name : String,
    open val cpf :  String
){
    val s = ""

    inner class Adress {
       var adress : String = s
       var number : String = s
    }
    fun concacternate(): String {
       val concactena = "$name  $cpf"
        return concactena
    }
}