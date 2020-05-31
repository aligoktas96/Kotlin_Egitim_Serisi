/**
 * Lambda function
 */

fun main() {
    print(sum(5,15))
}

val nameSurname = {firstName:String,surName:String -> print("$firstName $surName")}

val sum : (Int,Int) -> Int = {
        first,second -> first+second
}

