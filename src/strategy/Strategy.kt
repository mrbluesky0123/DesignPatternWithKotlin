package strategy

interface Strategy {
    fun nextHand(): Hand
    fun strudy(win: Boolean): Unit
}