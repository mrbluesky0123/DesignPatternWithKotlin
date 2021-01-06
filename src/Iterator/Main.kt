package Iterator

fun main(args: Array<String>) {
    val bookShelf: BookShelf = BookShelf(4)
    bookShelf.appendBook(Book("ABC"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cider"))
    bookShelf.appendBook(Book("Drain"))
    val it: Iterator = bookShelf.iterator()
    while(it.hasNext()) {
        val book: Book = it.next() as Book
        println(book.name)
    }

}