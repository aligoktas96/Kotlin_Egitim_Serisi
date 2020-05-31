/**
 * OOP - Visibility(Access) Modifiers
 *
 * Private - Public - Protected - Internal
 */
fun main() {
    var car = Car()
    var bmw = BMW()
    Called()
}

open class Car() {
    private var serialNumber = 1234
    protected var modal = 0
    public var color = ""
    internal var brand = ""
    internal fun changeBrand() {

    }
}

class Mercedes : Car() {
    init {
        var mrModal = modal
        changeBrand()
    }
}

class BMW {
    init {
        var car = Car()
    }
}


//-------------- Get & Set ----------------------

fun String.birlestir(words: String): String {
    return this + words
}

class Person {
    var name: String = "Ali"
        set(value) {
            field = value 
        }
}


class Called() {
    var person = Person()

    init {
        person.name = " --- "
        println(person.name)

    }
}














