fun main() {
    println("Bem vindo ao Bytebank")

    val account = Account()
    account.holder = "Leo"
    account.number = 1001
    account.balance = 200.0

    println(account.holder)
    println(account.number)
    println(account.balance)
}

class Account {
    var holder = ""
    var number = 0
    var balance = 0.0
}

fun testRepetition() {
    var i = 0

    while (i < 5) {
        val titular: String = "Leonardo $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 100.0

        println(
            "\nTitular: $titular\n" +
                    "Numero da conta: $numeroConta\n" +
                    "Saldo da conta: $saldo"
        )

        i++
    }

//    for (i in 1..5) {
//
//        val titular: String = "Leonardo $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = i + 100.0
//
//        println(
//            "\nTitular: $titular\n" +
//                    "Numero da conta: $numeroConta\n" +
//                    "Saldo da conta: $saldo"
//        )
//    }

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