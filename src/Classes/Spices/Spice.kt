package Classes.Spices

fun main(args: Array<String>) {
val curry = Curry("A", "Mild")
    println(curry.color)
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) :
    SpiceColor by color
{

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

    //fun makeSalt() = Spice("Salt", "mild")
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color),
    Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding...")
    }
}
