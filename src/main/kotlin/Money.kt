// By default, Kotlin classes are final – they can't be inherited. To make a
// class inheritable, mark it with the open keyword
abstract class Money(
    protected var amount: Int,
    protected var currency: String
) {
    abstract fun times(multiplier: Int): Money
    abstract fun currency(): String

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && this::class == money::class
    }
}