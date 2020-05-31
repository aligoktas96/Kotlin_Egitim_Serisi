/**
 * for (alias in range&dataList)
 * {
 *    code
 * }
 *
 */
fun main(){
    var employee = mutableListOf("Ali","Ayşe","Mehmet","Ceyda")

    for (person in employee) {
        when (person){
            "Ali" -> println("$person -> 1000 Tl zam aldınız")
            "Ayşe", "Mehmet" -> println("$person -> 2000 Tl zam aldınız")
            "Ceyda" -> println("$person -> 800 Tl zam aldınız")
            else -> println("Böyle bi çalışan yok")
        }
    }
    println("--")
    println("--")
    println("--")

    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}

