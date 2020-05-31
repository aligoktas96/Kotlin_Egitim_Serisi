import java.lang.ArithmeticException

/**
 * Exception
 * try&catch
 */
fun main() {
    if (divide(5,0).equals(true)){
        println("OK")
    }
    else{
        throwSomething()
    }

}

fun divide(first:Int,second:Int){
    try {
        print(first/second)
    }
    catch (e:ArithmeticException){
        println(" Hata alınan class ismi : ${e.stackTrace.get(0).className}")
        println(" Hata alınan method ismi : ${e.stackTrace.get(0).methodName}")
        println(" Hata alınan satır : ${e.stackTrace.get(0).lineNumber}")
    }
    finally {
        println("something")
    }
}

//----- throw ------
fun throwSomething():Nothing{
    throw Throwable("Bu işlem sıfıra bölünemediği için yapılamamıştır")
}
