package br.com.ivamotelo

class Managers(
    name: String,
    cpf: String,
    wage: Double,
    val senha: String
): Employees(name = name, cpf = cpf, wage = wage), Logins {

    override fun benefits(): Double { // Especialização da classe Managers
        var d: Double = 0.4
        return wage * d
    }

    override fun login(): Boolean = "senha1234" == senha // Retorna falso ou verdadeiro
}