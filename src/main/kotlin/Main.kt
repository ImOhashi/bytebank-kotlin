fun main() {
    println("Bem vindo ao Bytebank")

    val leo = Employee(name = "Leonardo", cpf = "123.456.789-00", salary = 1000.0)

    println("\nname: ${leo.name}\ncpf: ${leo.cpf}\nsalary: ${leo.salary}")
    println("\nBonus: ${leo.bonus()}")
}