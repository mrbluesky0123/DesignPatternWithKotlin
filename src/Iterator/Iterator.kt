package Iterator

interface Iterator {
    abstract fun hasNext(): Boolean
    abstract fun next(): Any?
}