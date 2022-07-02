//ANSWER
class BadExceptionA : Exception()

fun myFunctionA(test: String) {

    try {
        print("t")
        riskyCodeA(test)
        print("o")
    } catch (e: BadExceptionA) {
        print("a")
    } finally {
        print("w")
    }
    print("s")
}

fun riskyCodeA(test: String) {
    print("h")
    if (test == "Yes") {
        throw BadExceptionA()
    }
    print("r")
}

//MY VERSION 2

fun main() {
//    myFunction1("")
    myFunctionA("Yes")
}

class BadException1 : Exception()

fun myFunction1(test: String) {

    try {
        print("t")
        print("h")
        riskyCode1(test)
        print("r")
        print("o")
    } catch (e: BadException1) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}

fun riskyCode1(test: String) {
    if (test == "Yes") {
        throw BadException1()
    }
}

//MY VERSION 1

//class BadException : Exception()
//
//fun myFunction(test: String) {
//
//    try {
//        print("t")
//        print("h")
//        if (test == "Yes") {
//            print("a")
//        }
//    } catch (e: BadException) {
//
//        print("r")
//        print("o")
//        riskyCode(test)
//    } finally {
//        print("w")
//        print("s")
//    }
//}
//
//fun riskyCode(test:String) {
//    throw BadException()
//}