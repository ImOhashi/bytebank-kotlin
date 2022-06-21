class Account(
    val holder: String,
    val number: Int
) {
    var balance = 0.0
        private set

//    constructor(holder: String, number: Int) {
//        this.holder = holder
//        this.number = number
//    }

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

//    fun getBalance(): Double {
//        return this.balance
//    }
//
//    fun setBalance(value: Double) {
//        if (value >= 0) {
//            this.balance = value
//        }
//    }
}