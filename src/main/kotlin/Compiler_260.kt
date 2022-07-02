private class Cat1(var name: String? = "") {
    fun meow() {
        println("Meow!")
    }
}

private class Cat2(var name: String? = null) {
    fun meow() {
        println("Meow!")
    }
}

private class Cat3(var name: String? = "") {
    fun meow() {
        println("Meow!")
    }
}

private class Cat4(var name: String? = "") {
    fun meow() {
        println("Meow!")
    }
}

fun main() {
    var myCats1: Array<Cat1?> = arrayOf(Cat1("Misty"), null, Cat1("Socks"))
    var myCats2 = arrayOf(Cat2("Misty"), Cat2(null), Cat2("Socks"))
    var myCats3 = arrayOf(Cat3("Misty"), Cat3(null), Cat3("Socks"))
    var myCats4 = arrayOf(Cat4("Misty"), Cat4(null), Cat4("Socks")) //Null can not be a value of a non-null type String


    myCats1[0]?.name = null

    println(myCats1[0]?.name)
    myCats1[0]?.meow()

    myCats1[0]?.let {
        it.meow()
        println(it.name)
    }

    println("A")

    for (cat in myCats1) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.meow()
        }
    }

    println("B")

    for (cat in myCats2) {
        print("${cat.name}: ")
        cat.meow()
    }

    println("C")

    for (cat in myCats3) {
        print("${cat.name}: ") //свойство вернется как null
        cat.meow() //функция не вызовется
    }

    println("D")

    for (cat in myCats4) {
        if (cat != null) {
            print("${cat?.name}: ")
            cat?.meow()
        }
    }
}