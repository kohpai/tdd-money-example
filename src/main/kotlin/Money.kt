// By default, Kotlin classes are final – they can't be inherited. To make a
// class inheritable, mark it with the open keyword
open class Money(
    val amount: Int,
    private val currency: String
) : Expression {
    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    operator fun times(multiplier: Int): Expression =
        Money(amount * multiplier, currency)

    fun currency() = currency

    override operator fun plus(addend: Expression): Expression =
        Sum(this, addend)

    override fun reduce(bank: Bank, to: String) =
        Money(amount / bank.rate(currency, to)!!, to)

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString(): String {
        return "$amount $currency"
    }


}