package br.com.ivamotelo

abstract class Employees(
    override val name: String,   // Caracteristica geral de uma pessoa
    override val cpf: String,    // Caracteristica geral de uma pessoa
    val wage: Double             // Caracteristica específica de um funcionário
    ): Peoples(name, cpf){       // Funcionário herdou caracteristicas da classe abstrata Peoples

   protected abstract fun benefits(): Double  //comportamento específico de um funcionário, 'protected' garante
                                              // que apenas a classe mãe "employeers e filhos façam seu uso
                                               // Necessário declarar o tipo de retorno para classe filha (Boolean)

   //Observe que a função está no corpo da classe herdadda, especializada
   //que será sobrescrita pela classe filha
    override fun toString(): String = """
        Nome: $name
        CPF nº: $cpf
        Salário: $wage
        Auxílio: ${benefits()}  
        """.trimIndent()
    }
