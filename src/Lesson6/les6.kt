package Lesson6

import java.security.DigestException

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = { path.add(Directions.END); println("Game Over: " + path); path.clear(); false }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(dir: String?) {
        when (dir) {
            "n" -> move(north)
            "s" -> move(south)
            "e"-> move(east)
            "w"->move(west)
            else -> move(end)
        }

    }
}

fun main(args: Array<String>) {
    val gamei = Game()
//    println(gamei.path)
//    gamei.north()
//    gamei.east()
//    gamei.south()
//    gamei.west()
//    gamei.end()
//    println(gamei.path)

    while (true){
        print("Enter a direction: n/s/e/w:")
        gamei.makeMove(readLine())
    }

//    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
//    println(numbers)
//    println(myFunc(numbers){this.rem(3)})
//    println(numbers.divisibleBy { it.rem(3) })
}

fun myFunc(list: List<Int>, block: Int.() -> Int): List<Int> {
    return list.filter { it.block() == 0 }
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    return this.filter { block(it) == 0 }
}