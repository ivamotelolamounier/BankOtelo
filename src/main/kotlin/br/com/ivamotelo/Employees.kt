package br.com.ivamotelo
import br.com.ivamotelo.Peoples
import java.math.BigDecimal

abstract class Employees(
    override val name: String,   // Caracteristica geral de uma pessoa
    override val cpf: String,    // Caracteristica geral de uma pessoa
    val wage: BigDecimal         // Caracteristica específica de um funcionário
    ): Peoples(name, cpf){       // Funcionário herdou caracteristicas da classe abstrata Peoples

        abstract fun benefits()  //comportamento específico de um funcionário
}
