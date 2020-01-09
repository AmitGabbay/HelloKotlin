import java.util.*

fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3),3))
    println(fitMoreFish(10.0, listOf(),7,true))

}

fun getBirthday() : Int {
    print("\nEnter your birthday: ")
   return readLine()?.toIntOrNull() ?: 1
}

fun dayOfWeek() {
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        in 1..3 -> println("Weekday")
        else -> println("weekend")
    }
}
fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf( "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")

    print("\nEnter your birthday: ")
    val index = when(birthday){
        28 or 31-> 4
        in 1..7 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun fitMoreFish(tankSize: Double, currentFish : List<Int>, fishSize: Int = 2, hasDecorations :Boolean = true):Boolean {
    val actualTankSize = if (hasDecorations) 0.8*tankSize else tankSize
    val totalFishSize=currentFish.sum() + fishSize
    return (actualTankSize-totalFishSize>=0)
    }

