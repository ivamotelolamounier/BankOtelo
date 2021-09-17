package br.com.ivamotelo

class Analysts(
    name: String,
    cpf: String,
    wage: Double
) : Employees(name = name, cpf = cpf, wage = wage){  //Analysts herdou os membros da classe abstrata "Employeers"

    override fun benefits(): Double {  // Função implementada na classe filha, "Analysts", específica da mesma
        var d: Double = 0.1
        return wage * d
        }
    }