package Classes

open class Book(val title: String, val author: String) {
    private var currentPage = 0
    open fun readPage() {
        currentPage++
    }
}

class Ebook(title: String, author: String, val forrmat: String = "text") : Book(title, author) {
    private var words = 0
    override fun readPage() {
        words += 250
    }
}
