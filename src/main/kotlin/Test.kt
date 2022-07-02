fun main() {
    var dog: Dog? = Dog()
//    dog = null
    println(dog?.hunger)
    dog?.let {
        it.hunger
    }
//    dog?.eat()

//    if (dog != null) {
//        println(dog?.eat())
//    }

//    dog?.let {
//        println(it.age)
//        println(it.hunger)
//        it.eat()
//    }

//    val array = arrayOf("Hi", "Hello", null)
//    for (item in array) {
//        item?.let {
//            println(it)
//        }
//    }
}

class Dog {
    val age = 2
    var hunger = 10

    fun eat() {
        println("Dog eat")
    }


    var d: Dog? = Dog()

    fun myFun() {
        d?.eat()
        if (d != null) {
            println(d?.hunger)
            println(d?.age)
            d?.eat()
        }
    }
}