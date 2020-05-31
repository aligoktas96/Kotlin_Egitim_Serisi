/**
 *
 * OOP - Extension Functions
 *
 * fun Int.newFunc()
 *
 */

fun main() {
    var father = Dad()
    father.psychological("Mutlu")
    println(5.topla(15))
}

infix fun Dad.psychological(mood: String) {
    println("Ruh hali : $mood")
}

fun Int.topla(topla:Int):Int{
    return this+topla
}
