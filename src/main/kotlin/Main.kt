fun main() {
    println("Bem vindo ao Bytebank")

    for (i in 1..5) {

        val titular: String = "Leonardo $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 100.0

        println(
            "\nTitular: $titular\n" +
                    "Numero da conta: $numeroConta\n" +
                    "Saldo da conta: $saldo"
        )
    }

    //testCondition(saldo)
}

fun testCondition(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva!")
    } else if (saldo == 0.0) {
        println("Conta está zerada!")
    } else {
        println("Conta está negativa!")
    }

    when {
        saldo > 0.0 -> println("Conta está positiva!")
        saldo == 0.0 -> println("Conta está zerada!")
        else -> println("Conta está negativa!")
    }
}