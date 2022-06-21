class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {
    fun bonus(): Double {
        return this.salary * 0.1
    }
}