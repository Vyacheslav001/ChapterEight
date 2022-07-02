fun main() {
    try {
        myFunction("b")
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        println("Bummer")
    }

    fun turnOvenOn() {}
    fun turnOvenOff() {}
    fun bake() {}

    try {
        turnOvenOn()
        bake()
    } catch (e: Exception) {
        println("Baking experiment failed")
    } finally {
        turnOvenOff() //Выполняется в любом случае
    }

    try {
        setWorkRatePercentage(100)
    } catch (e: IllegalArgumentException){
        println("Bad")
    }
}

abstract class Roamable
class Wolff : Roamable() {
    fun eat() {}
}

class MyRoamable {
    var r: Roamable = Wolff()

    fun myFunction() {
        if (r is Wolff) {
            val wolf = r as? Wolff
            wolf?.eat()
        }
    }
}

fun myFunction(str: String) {
    val x = str.toInt()
    println(x)
    println("myFunction has ended")
}

//Намеренная выдача исключений
fun setWorkRatePercentage(x: Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
    println("Great!")
}

//try и throw являются выражениями

val str = "0"
val result = try {
    str.toInt()
} catch (e: Exception){
    null
}

//val h = w?.hunger ?: throw AnimalException()

var x: Nothing? = null