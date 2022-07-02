fun main() {
    val ducks = MyDuck(arrayOf(Duck(5), Duck(10)))

    ducks.quack()
    println(ducks.totalDuckHeight())
}

class Duck(val height: Int? = null) {
    fun quack() {
        println("Quack! Quack!")
    }
}

class MyDuck(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck?.let {
                it.quack()
            }
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = 0
        for (duck in myDucks) {
            h += duck?.height ?: 0
        }
        return h
    }
}
