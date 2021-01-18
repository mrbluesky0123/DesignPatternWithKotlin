package strategy

class Hand(val handValue: Int) {

    companion object {
        val HANDVALUE_RCK = 0
        val HANDVALUE_SCI = 1
        val HANDVALUE_PAP = 2
        val hand: Array<Hand> = arrayOf<Hand>(Hand(HANDVALUE_RCK), Hand(HANDVALUE_SCI), Hand(HANDVALUE_PAP))
        val name: Array<String> = arrayOf<String>("ROCK", "SCISSORS", "PAPER")

        fun getHand(handValue: Int): Hand = hand[handValue]
    }

    fun isStrongerThan(h: Hand): Boolean = this.fight(h) == 1

    fun isWeekerThan(h: Hand): Boolean = this.fight(h) == -1

    fun fight(h: Hand): Int {
        return when {
            this == h -> 0
            (this.handValue + 1) % 3 == h.handValue -> 1
            else -> -1
        }
    }

    override fun toString() = name[handValue]

}