package observer

class EventSubscriber constructor(publisher: Publisher): Observer {

    private var newsString: String = ""
    private var publisher: Publisher = publisher

    init {
        publisher.add(this)
    }

    override fun update(title: String, news: String) {
        this.newsString = "$title -------------------- \n $news"
        this.showNews()
    }

    fun showNews() {
        println(this.newsString)
    }

}