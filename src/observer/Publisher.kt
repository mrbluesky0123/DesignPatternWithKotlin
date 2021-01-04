package observer

interface Publisher {
    fun add(observer: Observer): Unit
    fun delete(observer: Observer): Unit
    fun notifyObserver(): Unit
}