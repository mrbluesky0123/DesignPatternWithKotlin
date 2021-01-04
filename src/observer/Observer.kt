package observer

interface Observer {
    fun update(title: String, news: String): Unit
}