fun main() {
    println("Bem vindo ao Bytebank")

    val accountLeo = Account()
    accountLeo.holder = "Leo"
    accountLeo.number = 1001
    accountLeo.setBalance(200.0)

    val accountAlex = Account()
    accountAlex.holder = "Alex"
    accountAlex.number = 1002
    accountAlex.setBalance(200.0)

    println(accountLeo.holder)
    println(accountLeo.number)
    println(accountLeo.getBalance())

    println(accountAlex.holder)
    println(accountAlex.number)
    println(accountAlex.getBalance())

    println("Depositando na conta do Alex")
    accountAlex.deposit(50.0)
    println(accountAlex.getBalance())

    accountAlex.withdrawMoney(15.0)
    println(accountAlex.getBalance())

    accountLeo.transfer(100.0, accountAlex)

    accountAlex.withdrawMoney(500.0)

    println(accountLeo.getBalance())
    println(accountAlex.getBalance())
}

class Account {
    var holder = ""
    var number = 0
    private var balance = 0.0

    fun deposit(value: Double) {
        this.balance += value
    }

    fun withdrawMoney(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        } else {
            println("Valor acima do permitido!")
        }
    }

    fun transfer(value: Double, destiny: Account): Boolean {
        if (this.balance >= value) {
            this.balance -= value
            destiny.balance += value

            return true
        }

        return false
    }

    fun getBalance(): Double {
        return this.balance
    }

    fun setBalance(value: Double) {
        if (value >= 0) {
            this.balance = value
        }
    }
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