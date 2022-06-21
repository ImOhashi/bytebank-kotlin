fun main() {
    println("Bem vindo ao Bytebank")

    val leo = Employee(name = "Leonardo", cpf = "123.456.789-00", salary = 1000.0)

    println("\nname: ${leo.name}\ncpf: ${leo.cpf}\nsalary: ${leo.salary}")
    println("\nBonus: ${leo.bonus()}")

    val fran = Manager(name = "Fran", cpf = "123.456.789-00", salary = 2000.0, password = 1234)

    println("\nname: ${fran.name}\ncpf: ${fran.cpf}\nsalary: ${fran.salary}")
    println("\nBonus: ${fran.bonus()}")

    if(fran.authenticate(1234)) {
        println("Auth ok!")
    } else {
        println("Error!!!")
    }

    val gui = Director(name = "Gui", cpf = "123.456.789-00", salary = 3000.0, password = 1234, plr = 4000.0)

    println("\nname: ${gui.name}\ncpf: ${gui.cpf}\nsalary: ${gui.salary}")
    println("\nBonus: ${gui.bonus()}")

    if(fran.authenticate(1234)) {
        println("Auth ok!")
    } else {
        println("Error!!!")
    }
}