data class Recipes(val title: String, val isVegatarian: Boolean)

// тренировка с классом данных
fun main(args: Array<String>) {
    val r1 = Recipes("Thai Curry", false)
    val r2 = Recipes("Thai Curry", false)
    val r3 = r1.copy(title = "Пельмени")

    println("r1 hash code : ${r1.hashCode()}")
    println("r2 hash code : ${r2.hashCode()}")
    println("r3 hash code : ${r3.hashCode()}")

    println("r1 toString : ${r1.toString()}")

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title, vegatarian) = r1
    println("title is $title and vegatarian is $vegatarian")
}