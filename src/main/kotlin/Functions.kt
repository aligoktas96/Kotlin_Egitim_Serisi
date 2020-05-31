/**
 * fun funcName(params) code
 *
 */
fun main(){
    evenOrOdd(5)
    justDoIt()
    println(division(10,2))
}

fun evenOrOdd(number:Int){
    if (number%2==0) println("Sayınız çift")
    else println("Sayınız tek")
}

fun justDoIt(){
    println("Fonksiyon çalıştı")
}

fun division(firstNumber:Int,secondNumber:Int):Int {
    return firstNumber/secondNumber
}


