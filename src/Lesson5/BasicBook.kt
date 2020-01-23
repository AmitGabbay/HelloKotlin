package Lesson5

const val makBooksToBorrow = 5

class BasicBook(val title: String, val author: String, val year: Int) {

    fun canBorrow(numOfBooksBorrowed: Int) = numOfBooksBorrowed <= makBooksToBorrow
    fun titleAndAuthor(): Pair<String, String> = title to author
    //return Pair(title, author)
    fun getAll(): Triple<String, String, Int> = Triple(title, author, year)
    fun printUrl() = println(BASE_URL + this.title+ ".html")


    companion object {
        const val BASE_URL = """http:\\books.gov.il\"""
    }
}

fun main(args: Array<String>) {
//    val book = BasicBook("Habor", "LO ZOHER", 2000)
//    //val abc = book.getAll()
//    val (title, author, year) = book.getAll()
//    println("Here is you book $title written by $author in $year")
    val allBooks = setOf("Hamlet", "b")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("shake") })

    val moreBooks = mutableMapOf("A" to "b")
    moreBooks.getOrPut("C", { "D" })

    val book = BasicBook("Habor", "LO ZOHER", 2000)
    book.printUrl()

}

