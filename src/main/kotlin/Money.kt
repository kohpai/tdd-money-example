// By default, Kotlin classes are final – they can't be inherited. To make a
// class inheritable, mark it with the open keyword
open class Money(
    protected var amount: Int,
    protected var currency: String
) {
    fun times(multiplier: Int) = Money(amount * multiplier, currency)

    fun currency() = currency

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString(): String {
        return "$amount $currency"
    }


}