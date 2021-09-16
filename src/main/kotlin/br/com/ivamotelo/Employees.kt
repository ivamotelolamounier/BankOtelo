package br.com.ivamotelo

abstract class Employees(
    override val name: String,   // Caracteristica geral de uma pessoa
    override val cpf: String,    // Caracteristica geral de uma pessoa
    val wage: Double             // Caracteristica específica de um funcionário
    ): Peoples(name, cpf){       // Funcionário herdou caracteristicas da classe abstrata Peoples

   protected abstract fun benefits(): Double  //comportamento específico de um funcionário, 'protected' garante
                                              // que apenas a classe mãe e filhos façam seu uso

   //Observe que a função está no corpo da classe herdadda, especializada
    override fun toString(): String = """
        Nome: $name
        CPF nº: $cpf
        Salário: $wage
        Auxílio: ${benefits()}  
        """.trimIndent()
    }
