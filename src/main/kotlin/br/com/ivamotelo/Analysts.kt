package br.com.ivamotelo

class Analysts(
    name: String,
    cpf: String,
    wage: Double): Employees(
    name, cpf, wage){
    override fun benefits(): Double {
        var d: Double = 0.1
        return wage * d
        }
    }