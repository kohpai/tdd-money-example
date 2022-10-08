class Sum(val augend: Expression, val addend: Expression) : Expression {
    override fun plus(addend: Expression): Expression = Sum(this, addend)

    override fun reduce(bank: Bank, to: String) =
        Money(
            augend.reduce(bank, to).amount + addend.reduce(bank, to).amount,
            to
        )
}