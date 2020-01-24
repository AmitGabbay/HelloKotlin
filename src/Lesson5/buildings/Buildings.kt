package Lesson5.buildings

open class BasicBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BasicBuildingMaterial(4)
class Brick : BasicBuildingMaterial(8)

class Building<T : BasicBuildingMaterial>(val material: T) {
    val baseMaterialNeeded = 100
    val actualMaterialsNeeded
        get() = material.numberNeeded * baseMaterialNeeded

    fun build() {
        println("Type is ${material::class.simpleName} and $actualMaterialsNeeded pieces are needed.")
    }

}

fun main(args: Array<String>) {
    val b = Building(Wood())
    b.build()
    //Building(Wood()).build()
}