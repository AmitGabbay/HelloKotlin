package Lesson5

import kotlin.random.Random

const val makBooksToBorrow = 5

class BasicBook(val title: String, val author: String, val year: Int, var pages: Int) {

    fun canBorrow(numOfBooksBorrowed: Int) = numOfBooksBorrowed <= makBooksToBorrow
    fun titleAndAuthor(): Pair<String, String> = title to author
    //return Pair(title, author)
    fun getAll(): Triple<String, String, Int> = Triple(title, author, year)

    fun printUrl() = println(BASE_URL + this.title + ".html")


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

    val book = BasicBook("Habor", "LO ZOHER", 2000, 50)
    book.printUrl()
    val littlePuppy = Puppy()
    littlePuppy.playWithBooks(book)
    println(book.pages)
    book.pages = 50
    littlePuppy.playWithBooks(book)
    println(book.pages)

}

fun BasicBook.weight(): Double = this.pages * 1.5
fun BasicBook.tornPages(numOfTornPages: Int) { this.pages -= numOfTornPages }


class Puppy() {
    fun playWithBooks(book: BasicBook) {
        book.tornPages(Random.nextInt(book.pages))
    }
}
