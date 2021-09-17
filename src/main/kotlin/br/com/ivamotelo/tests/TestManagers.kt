package br.com.ivamotelo.tests
import br.com.ivamotelo.Logins
import br.com.ivamotelo.Managers
import br.com.ivamotelo.PrintReportEmployees

fun main(){
    // Cria uma instância de Managers
    val Maria = Managers("Maria do Carmo", "3216540001", 7000.0, "senha1234")

    PrintReportEmployees.printReportEmployees(Maria)
    TestAutentic().autentic(logins = Maria)
}