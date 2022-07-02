fun main(args: Array<String>) {
    var str: String? = null
//    println(str)

    var mw1: MyWolf? = MyWolf()
    var mw2: MyWolf = MyWolf()

//    mw1 = null

    //TODO почему элвис безопаснее if?
    if (mw1 != null) println(mw1.w?.hunger) else println(-1)
    println(mw1?.w?.hunger ?: -1)

    mw1?.w?.hunger
//    mw2.w?.hunger

//    mw1?.myFunction()

//    var alpha = getAlphaWolf()
//    alpha?.eat()
//
//    getAlphaWolf()?.let {
//        it.eat()
//    }
}

class Wolf {
    val hunger = 10

    fun eat() {
        println("eat")
    }
}

class MyWolf {

    //TODO почему свойства final?
    var w: Wolf? = Wolf()
    var f = 1

    fun myFunction() {
        w?.eat()
        println(w?.hunger)
        if (w != null) {
            w = null
            w?.eat()
            println(w?.hunger)
            println(w!!.hunger)
            w?.let { println(it.hunger) }
        }
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}