class Franc(amount: Int): Money(amount) {
    fun times(multiplier: Int) = Franc(amount * multiplier)
}