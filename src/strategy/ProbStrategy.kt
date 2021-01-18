package strategy

import kotlin.random.Random

class ProbStrategy(val seed: Int): Strategy {
    private val random: Random = Random(seed)
    private var prevHandValue = 0
    private var currentHandValue = 0
    private var history: Array<Array<Int>> = Array

    override fun nextHand(): Hand {
        TODO("Not yet implemented")
    }

    override fun strudy(win: Boolean) {
        TODO("Not yet implemented")
    }

}