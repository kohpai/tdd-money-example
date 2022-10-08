class Bank {
    private val rates = HashMap<Pair, Int>()

    fun reduce(expression: Expression, to: String) = expression.reduce(this, to)

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String) =
        if (from == to) 1 else rates[Pair(from, to)]

    private class Pair(val from: String, val to: String) {
        override fun equals(other: Any?): Boolean {
            val pair = other as Pair
            return from == pair.from && to == pair.to
        }

        override fun hashCode(): Int = 0
    }
}