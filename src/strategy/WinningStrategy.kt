package strategy

import kotlin.random.Random

class WinningStrategy(private val seed: Int): Strategy {

    private val random: Random = Random(this.seed)
    private var won = false
    private var prevHand: Hand? = null

    override fun nextHand(): Hand {
        if(!this.won) {
            prevHand = Hand.getHand(random.nextInt(3))
        }
        return this.prevHand!!
    }

    override fun strudy(win: Boolean) {
        this.won = win
    }

}