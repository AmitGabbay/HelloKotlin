package Lesson5.buildings

open class BasicBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BasicBuildingMaterial(4)
class Brick : BasicBuildingMaterial(8)

class Building<out T : BasicBuildingMaterial>(val material: T) {
    val baseMaterialNeeded = 100
    val actualMaterialsNeeded
        get() = material.numberNeeded * baseMaterialNeeded

    fun build() {
        println("Type is ${material::class.simpleName} and $actualMaterialsNeeded pieces are needed.")
    }
}

fun bulidi(ba : Building<BasicBuildingMaterial>){println(ba.material.numberNeeded)}

fun <T: BasicBuildingMaterial> isSmallBuilding(b : Building<T>) {
    if (b.actualMaterialsNeeded< 500) println("Small") else println("Big")
}


fun main(args: Array<String>) {
    //val b = Building(Wood())
    //b.build()
    //bulidi(b)
    //isSmallBuilding(b)
    //Building(Wood()).build()

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i > 5) break@loop
            print("$i,$j  ")
        }
        println()
    }

}