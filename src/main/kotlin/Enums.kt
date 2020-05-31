/**
 * OOP - Enum class
 *
 * Enum class Name{ A,B,C,D}
 *
 */

fun main(){
    tellMeCurrentDay(Days.MONDAY)
}

enum class Days(val day : String){
    MONDAY("Pazartesi"),
    TUESDAY("Salı"),
    WEDNESDAY("Çarşamba"),
    THURSDAY("Perşembe"),
    FRIDAY("Cuma"),
    SATURDAY("Cumartesi"),
    SUNDAY("Pazar")
}


fun tellMeCurrentDay(day : Days){
    println(day.day)
}

/**
  -  OTHER USAGE  -

    fun main(){
        tellMeCurrentDay(Days.SUNDAY)
    }


    enum class Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

    fun tellMeCurrentDay(days: Days){
        when(days){
        Days.MONDAY -> println("Pazartesi")
        Days.TUESDAY -> println("Salı")
        Days.THURSDAY -> println("Çarşamba")
        Days.WEDNESDAY -> println("Perşembe")
        Days.FRIDAY -> println("Cuma")
        Days.SATURDAY -> println("Cumartesi")
        Days.SUNDAY -> println("Pazar")
    }
    }

 */
