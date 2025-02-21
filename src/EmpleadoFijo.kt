class EmpleadoFijo(nombre: String, id: Int, val salarioFijo: Double, val numPagas: Int) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}