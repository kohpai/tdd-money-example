// By default, Kotlin classes are final – they can't be inherited. To make a
// class inheritable, mark it with the open keyword
abstract class Money(protected var amount: Int) {
    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && this::class == money::class
    }
}