/**
 * when (condition) -> state
 */

fun main(){
    print("Not bilgisi :")
    var not = readLine()!!.toInt()

    when (not){
        in 80..100 step 2 -> print("Harf notunuz AA ")
        in 60..80 -> print("Harf notunuz BB ")
        in 40..60 -> print("Harf notunuz CC ")
        in 0..40 -> print("Kaldınız")
        !in 0..100 -> print("Yanlış bir not")
        in 100..Int.MAX_VALUE -> print("Böyle bir not yok.")
        else -> print("Tebrikler")
    }

}