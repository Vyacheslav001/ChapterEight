fun main() {
    val test: String = "Yes"

    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }

    println("End of main")
}

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start risky code")

    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}

//МОЕ РЕШЕНИЕ

//test == No //ВЕРНО!!!

//Start try
//Start risky code
//End risky code
//End try
//Finally
//End of main

//test == Yes //НЕВЕРНО!!!
//Блок try{} выполняет все, что предшествует ошибке, затем прерывает свое выполнение и переходит в следующий блок

//Bad Exception
//Finally
//End of main

//ПРАВИЛЬНЫЙ ОТВЕТ
//Start try
//Start risky code
//Bad Exception
//Finally
//End of main