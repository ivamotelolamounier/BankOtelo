package br.com.ivamotelo.tests
import br.com.ivamotelo.Analysts
import br.com.ivamotelo.PrintReportEmployees

fun main(){
    val joao = Analysts("João Pedro", "321654987", 5000.0) // Cria uma instância de Analysts

    PrintReportEmployees.printReportEmployees(joao)
    PrintReportEmployees.printReportEmployees(joao)

}