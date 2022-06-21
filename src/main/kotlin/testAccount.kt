fun testAccount() {
    val accountLeo = Account(holder = "Leo", number = 1001)
    accountLeo.deposit(200.0)

    val accountAlex = Account(number = 1002, holder = "Alex")
    accountAlex.deposit(200.0)

    println(accountLeo.holder)
    println(accountLeo.number)
    println(accountLeo.balance)

    println(accountAlex.holder)
    println(accountAlex.number)
    println(accountAlex.balance)

    println("Depositando na conta do Alex")
    accountAlex.deposit(50.0)
    println(accountAlex.balance)

    accountAlex.withdrawMoney(15.0)
    println(accountAlex.balance)

    accountLeo.transfer(100.0, accountAlex)

    accountAlex.withdrawMoney(500.0)

    println(accountLeo.balance)
    println(accountAlex.balance)
}