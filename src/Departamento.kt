class Departamento {
    private val empleados = mutableListOf<Empleado>()

    fun aregarEmpleado(empleado : Empleado){
        empleados.add(empleado)
    }

    fun calcularSalarioTotal(): Double {
        return empleados.sumOf { it.calculaSalario() }
    }

    fun mostrarInformacionEmpleados(){
        empleados.forEach {empleado ->
            println("Nombre: ${empleado.nombre} con ID-${"%0001".format(empleado.id)} " +
                    "tiene un salario de ${"%.2f".format(empleado.calculaSalario())} al mes.")
        }
    }
}