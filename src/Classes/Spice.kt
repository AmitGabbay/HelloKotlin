package Classes

class Spice(val name: String, val spiciness: String = "mild") {


    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "hot" -> 2
                "extraHot" -> 3
                else -> 0
            }
        }

    init {
        println("Name: $name, Heat: $heat")
    }


    fun makeSalt() = Spice("Salt", "mild")


}

