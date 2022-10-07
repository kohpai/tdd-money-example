class Franc (private var amount: Int) {
    fun times(multiplier: Int) = Franc(amount * multiplier)

    override fun equals(other: Any?): Boolean {
        val dollar = other as Franc
        return amount == dollar.amount
    }
}