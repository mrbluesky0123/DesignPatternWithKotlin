package observer

class NewsMachine: Publisher {

    private val observers: ArrayList<Observer> = ArrayList<Observer>()
    private var title: String = ""
    private var news: String = ""

    override fun add(observer: Observer) {
        this.observers.add(observer)
    }

    override fun delete(observer: Observer) {
        val index = this.observers.indexOf(observer)
        this.observers.removeAt(index)
    }

    override fun notifyObserver() {
        for(observer in this.observers) {
            observer.update(title, news)
        }
    }

    fun setNewsInfo(title: String, news: String) {
        this.title = title
        this.news = news
        this.notifyObserver()
    }

}