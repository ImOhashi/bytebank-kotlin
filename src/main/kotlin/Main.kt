fun main() {
    println("Bem vindo ao Bytebank")

    val titular: String = "Leonardo"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100.0

    println(
        "\nTitular: $titular\n" +
                "Numero da conta: $numeroConta\n" +
                "Saldo da conta: $saldo"
    )

    testCondition(saldo)

    when {
        saldo > 0.0 -> println("Conta está positiva!")
        saldo == 0.0 -> println("Conta está zerada!")
        else -> println("Conta está negativa!")
    }
}

fun testCondition(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva!")
    } else if (saldo == 0.0) {
        println("Conta está zerada!")
    } else {
        println("Conta está negativa!")
    }
}