class Manager(
    val password: Int,
    name: String,
    cpf: String,
    salary: Double
) :
    Employee(
        name = name,
        cpf = cpf,
        salary = salary
    ) {
    fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }

        return false
    }
}