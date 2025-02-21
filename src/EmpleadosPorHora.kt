class EmpleadoPorHora(nombre: String, id: Int, val horasTrabajadas: Double, val tarifaPorHora: Double) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }
}