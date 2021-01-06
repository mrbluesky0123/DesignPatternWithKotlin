package Iterator

class BookShelfIterator(val bookShelf: BookShelf, var index: Int = 0): Iterator {

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()

    }

    override fun next(): Any? {
        val book: Book? = this.bookShelf.getBookAt(index)
        index++
        return book
    }

}