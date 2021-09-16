package br.com.ivamotelo
import br.com.ivamotelo.Logins

class Managers(
    name: String,
    cpf: String,
    wage: Double,
    val senha: String
): Employees(name = name, cpf = cpf, wage = wage), Logins {

    override fun benefits(): Double = wage * 0.4     // Especialização da classe Managers

    override fun login(): Boolean = "senha1234" == senha  // Especialização da classe Managers
    }