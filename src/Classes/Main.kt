package Classes

fun main(args: Array<String>){
//    val sp = SimpleSpice()
//    println("Name: ${sp.name} " +
//            "Heat: ${sp.heat}")

    val list = listOf(Spice("A"), Spice("B", "hot"),
        Spice("C", "extraHot"), Spice("D", "aa")
    )

    val list2 = list.filter { it.heat>0 }

for (sp :Spice in list2){
    println(sp.name)
}
}

