import java.util.*

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
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

