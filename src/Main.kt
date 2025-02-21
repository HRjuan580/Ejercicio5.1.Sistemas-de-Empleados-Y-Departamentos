
fun main(){

    val departamento = Departamento()

    val empleado1 = EmpleadoPorHora("Pedro Alas", 1, 160.0, 10)
    val empleado2= EmpleadoFijo("Ana Parlante", 2, 30000.0, 12)
    val empleado3 = EmpleadoPorHora("Carlos Vuela", 3, 130, 20)

    departamento.aregarEmpleado(empleado1)
    departamento.aregarEmpleado(empleado2)
    departamento.aregarEmpleado(empleado3)

    println("Informacion de los empleados:")
    departamento.mostrarInformacionEmpleados()

    println("\nSalario total del departamento: ${"%.2f".format(departamento.calcularSalarioTotal())}")
}