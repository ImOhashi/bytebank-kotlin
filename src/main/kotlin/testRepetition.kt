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