/**
 * OOP - Infix Functions
 *
 * infix fun Int.newFunc
 */
fun main() {
    println(15 bolme 5)
    println(15.bolme(5))

    1..10 step 5
    0 until 10
}

infix fun Int.bolme(bolen:Int):Int = this / bolen
