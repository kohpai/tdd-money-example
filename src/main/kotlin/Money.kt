// By default, Kotlin classes are final – they can't be inherited. To make a
// class inheritable, mark it with the open keyword
open class Money(protected var amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount
    }
}