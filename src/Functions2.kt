fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
    print("Enter your mood: ")
    val mood = readLine()
    println(whatShouldIDoToday(mood!!))
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