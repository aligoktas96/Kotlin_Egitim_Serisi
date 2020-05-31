/**
 * OOP - Function Overloading
 *
 * Same name - different work
 */
fun main() {
    sayNotes("Ali","Süreye dikkat etmelisin")
}

fun sayNotes(studentName: String, note: Int) {
    println("$studentName isimli öğrencinin notu : $note")
}

fun sayNotes(studentName: String, note: Int, congratsDoc: Boolean) {
    if (congratsDoc) println("Tebrikler Başarı Belgesi KAZANDINIZ !!")
    println("$studentName isimli öğrencinin notu : $note")
}

fun sayNotes(studentName: String, suggestion: String) {
    println("$studentName isimli öğrenciye tavsiye : $suggestion")
}