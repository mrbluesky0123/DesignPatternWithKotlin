package strategy

import kotlin.random.Random

class ProbStrategy(val seed: Int): Strategy {
    private val random: Random = Random(seed)
    private var prevHandValue = 0
    private var currentHandValue = 0
    private var history: Array<Array<Int>> = Array(3){Array(3){1}}

    override fun nextHand(): Hand {
        val bet = random.nextInt(this.getSum(currentHandValue))
        var handValue = 0
        if(bet < history[currentHandValue][0]) {
            handValue = 0
        } else if( bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1
        } else {
            handValue = 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)

    }

    private fun getSum(hv: Int): Int {
        var sum: Int = 0
        for (i in 0 until 3) {
            sum += history[hv][i]
        }
        return sum
    }

    override fun study(win: Boolean) {
        if(win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 1) % 2]++
        }
    }
}