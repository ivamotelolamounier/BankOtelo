package br.com.ivamotelo

data class Banks(
    var bankName : String,
    var bankNumber: Int
    ){
    fun info(): String {
        val s1: String = bankName
        val s2: String = bankNumber.toString()
        return "$s1 $s2"
    }
}

