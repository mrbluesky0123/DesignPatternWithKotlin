package future

class Host {
    fun request(count: Int, c: Char): Data {
        println("## Request (count: $count, content: $c) BEGINS")

        val future: FutureData = FutureData()

        object: Thread() {
            override fun run() {
                val data = RealData(count, c)
                future.setRealData(data)
            }
        }.start()

        println("## Request($count, $c) ENDED")

        return future

    }
}