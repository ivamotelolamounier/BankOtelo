package br.com.ivamotelo.tests
import br.com.ivamotelo.*

fun main(){
    // Cria uma instância de Managers
    val pedro = Customers("Pedro da Silva", "32165587", CustomersTypes.PF,"senha1234")

    PrintReportCustumers.printReportCustumers(pedro)
    TestAutentic().autentic(logins = pedro)
}