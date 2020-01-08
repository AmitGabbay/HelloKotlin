import java.util.*

fun main(args: Array<String>) {
    //val hour : Int  = args[0].toInt()
    //println("${if(args[0].toDouble()<12) "Good Morning, Kotlin" else "Good Night"}")
    var fortune : String?
    var runs = 0
    do {
        fortune =getFortuneCookie()
        runs++
        println("Your Fortune is $fortune.")

    } while (fortune!="d" && runs < 10)

}

fun dayOfWeek() {
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        in 1..3 -> println("Weekday")
        else -> println("weekend")
    }
}
    fun getFortuneCookie() : String  {
        val greetings = listOf("a", "b", "c", "d", "e")
        print("Enter your birthday: ")
        //val a = readLine()
        var birthday  = readLine()?.toIntOrNull() ?: 1
        birthday = birthday.rem(greetings.count())
        return greetings[birthday]
    }

