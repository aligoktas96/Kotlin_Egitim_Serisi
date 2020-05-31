/**
 *      -------
 *     |   DO  |    <-----------------|
 *      -------                       |
 *         |                          |
 *         |                          |
 *         |                          |
 *        \|/                         |
 *   --------------------             |
 *  |  While Condition   | = True -----
 *   --------------------
 **/

fun main() {
    var class3A = mutableMapOf<Int, String>(1 to "Ali", 2 to "Ayşe")
    var class3B = mutableMapOf<Int, String>(3 to "Merve", 4 to "Sevgi", 5 to "Mehmet")
    var totalStudent = class3A.size + class3B.size

    do {
        println("Öğrencinin ismini girin : ")
        var whichStudent = readLine()!!
        println("Öğrencinin sınıfını girin : ")
        var whichClass = readLine()!!
        if (whichClass == "a") {
            totalStudent++
            class3A.put(totalStudent,whichStudent)
        }
        else if (whichClass == "b") {
            totalStudent++
            class3B.put(totalStudent,whichStudent)
        }
        else if (whichClass == "c") {
            println("Bu sınıfı kapattık. ")
            println("A sınıfı öğrenci : \t $class3A")
            println("B sınıfı öğrenci : \t $class3B")
            break
        }
        else {
            println("Bu sınıf yanlış tekrar deneyin")
            continue
        }
        println("$whichStudent isimli öğrenci $totalStudent numarasıyla $whichClass sınıfına yerleştirildi")
    }while (totalStudent<9)

    println("A sınıfı öğrenci : \t $class3A")
    println("B sınıfı öğrenci : \t $class3B")
}