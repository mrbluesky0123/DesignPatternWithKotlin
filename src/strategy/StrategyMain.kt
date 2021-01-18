package strategy

fun main(args: Array<String>) {
    val seed1 = Integer.parseInt(args[0])
    val seed2 = Integer.parseInt(args[1])
    var player1: Player = Player("유재석", WinningStrategy(seed1))
    var player2: Player = Player("김종국", ProbStrategy(seed2))

    for(i in 0 until 10000) {
        var nextHand1: Hand = player1.nextHand()
        var nextHand2: Hand = player2.nextHand()

        if(nextHand1.isStrongerThan(nextHand2)) {
            println("Winner: $player1")
            player1.win()
            player2.lose()
        } else if(nextHand2.isStrongerThan(nextHand1)) {
            println("Winner: $player2")
            player1.lose()
            player2.win()
        } else {
            println("Even...")
            player1.even()
            player2.even()
        }

        println("Total result:")
        println("${player1.toString()}")
        println("${player2.toString()}")
    }
}