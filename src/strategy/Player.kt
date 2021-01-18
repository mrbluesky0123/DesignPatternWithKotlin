package strategy

class Player(val name: String, val strategy: Strategy) {
    private var winCount: Int = 0
    private var loseCount: Int = 0
    private var gameCount: Int = 0

    fun nextHand(): Hand = strategy.nextHand()

    fun win(): Unit {
        strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose(): Unit {
        strategy.study(false)
        loseCount--
        gameCount++
    }

    fun even(): Unit {
        gameCount++
    }
    override fun toString(): String {
        return "[$name: $gameCount games, $winCount wins, $loseCount loses]"
    }
}