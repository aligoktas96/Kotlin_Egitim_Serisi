/**
 * OOP - Inheritance
 *
 */

fun main() {
    var child = Son()
    child.characteristics("Mavi","Sarı")
}

open class Dad {
    fun characteristics(eyeColor: String, hairColor: String) {
        println("Göz rengi : $eyeColor")
        println("Saç rengi : $hairColor")
    }
}

class Son:Dad()