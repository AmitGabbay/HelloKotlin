import kotlin.math.roundToInt
import kotlin.random.Random

fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
//    print("Enter your mood: ")
//    val mood = readLine()
//    println(whatShouldIDoToday(mood!!))

    repeat(10){gamePlay(rollDice3(7))}
}

fun whatShouldIDoToday(mood : String, weather : String = "Sunny", temperature : Int = 24) : String{

    return when {
        isHappyAndSunny(mood, weather) -> "go for a walk"
        isSadRainyAndCold(mood, weather, temperature) -> "stay in bed"
        isFuckingHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isHappyAndSunny(mood : String, weather : String) = mood == "happy" && weather == "Sunny"
fun isSadRainyAndCold(mood : String, weather : String, temperature : Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isFuckingHot(temperature: Int) = temperature > 35

val rollDice = {numOfSides : Int ->if (numOfSides!=0) (Math.random()*12).roundToInt() else 0}
val rollDice2 : (Int)->Int = {numOfSides ->if (numOfSides!=0) (Math.random()*12).roundToInt() else 0}

val rollDice3= {numOfSides : Int ->if (numOfSides!=0) Random.nextInt(12)+1 else 0}

fun gamePlay(roll: Int){
    println(roll)
}

