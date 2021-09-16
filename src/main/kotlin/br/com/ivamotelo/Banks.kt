package br.com.ivamotelo

data class Banks(
    var bankName : String,
    var bankNumber: Int
    ){
    fun info() = "$bankName" + " " + "$bankNumber"


}

