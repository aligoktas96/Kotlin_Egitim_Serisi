/**
 * while (expression) {
 *   code
 * }
 *
 *
 */
fun main(){
    var age = 0

    var todayAge = 24
    while (age<24){
        age++
        println("Şimdiki yaşınız : $age")
    }

    var classRoom = mutableListOf("Ali","Ayşe","Merve","Cemre")

    while (classRoom.size<10){
        classRoom.add("Yeni Öğrenci")
    }

    println(classRoom)
}