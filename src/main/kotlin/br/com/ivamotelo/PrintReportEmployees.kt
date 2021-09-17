package br.com.ivamotelo
import br.com.ivamotelo.Employees


// 'companion object -> método estático invocado via classe e não via instância
// trabalha com abstração 'employee : Employees"

class PrintReportEmployees {

    companion object {
        fun printReportEmployees(employee: Employees) {
            println(
                employee.toString()
            )
        }
    }
}
class  PrintReportCustumers{

    companion object {
        fun printReportCustumers(customer: Peoples) {
            println(
                customer.toString()
            )
        }
    }
}