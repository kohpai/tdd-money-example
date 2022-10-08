class Franc(amount: Int, currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int) = franc(amount * multiplier)

    override fun currency() = currency
}