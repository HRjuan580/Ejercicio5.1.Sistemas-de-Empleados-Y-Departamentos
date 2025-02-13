abstract class Empleado(val nombre: String, val id: Int) {
    abstract fun calculaSalario(): Double

    override fun toString(): String {
        return "$nombre, ID ~${"%04d".format(id)}, tiene un salario de ${"%.2f".format(calculaSalario())} al mes"
    }

}