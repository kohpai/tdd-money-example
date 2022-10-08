// If the derived class has a primary constructor, the base class can (and must)
// be initialized in that primary constructor according to its parameters.
// If the derived class has no primary constructor, then each secondary
// constructor has to initialize the base type using the super keyword or it has
// to delegate to another constructor which does. Note that in this case
// different secondary constructors can call different constructors of the base
// type
class Dollar(amount: Int, currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int) = dollar(amount * multiplier)

    override fun currency() = currency
}