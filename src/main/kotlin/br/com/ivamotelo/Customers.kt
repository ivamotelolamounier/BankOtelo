package br.com.ivamotelo

class Customers(
    name: String,
    cpf: String,
    val customerType: CustomersTypes, //Classe ENUM
    val senha: String                 // Polimorfismo (classes diferentes - Peoples e Managers
): Peoples(name = name, cpf = cpf), Logins {

    override fun toString(): String = """
        Nome: $name
        CPF nº: $cpf
        Tipo: ${customerType.clientDescription} 
    """.trimIndent()

    override fun login(): Boolean = "senha1234" == senha // Retorna falso ou verdadeiro
}