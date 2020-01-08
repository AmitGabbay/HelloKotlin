import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek(){
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        in 1..3 -> println("Weekday")
        else -> println("weekend")
    }

}