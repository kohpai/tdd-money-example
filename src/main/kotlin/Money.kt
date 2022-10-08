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

    fun times(multiplier: Int) = Money(amount * multiplier, currency)

    fun currency() = currency

    operator fun plus(addend: Money): Expression = Sum(this, addend)
    override fun reduce(to: String) = this

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString(): String {
        return "$amount $currency"
    }


}