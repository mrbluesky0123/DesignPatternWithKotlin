package Iterator

class BookShelf(val maxSize: Int): Aggregate {
    var books = arrayOfNulls<Book>(maxSize)
    var last: Int = 0

    fun getBookAt(index: Int): Book? {
        return books[index]
    }

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator() {
        return new BookShelfIterator(this)
    }

}