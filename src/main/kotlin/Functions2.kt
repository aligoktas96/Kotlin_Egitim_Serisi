/**
 *
 * Named Arguments - Vararg
 *
 * fun some(a:Int,b:String)
 *
 * some(b="someString",a=3)
 *
 * fun some2(vararg a:String)
 *
 * some2("asd","dsa,"sda")
 *
 */
fun main() {
    human("Ali",24)

    human(age = 24,name = "Ali")


    humans("Ali","Veli","Fatma","Elif")
}

fun human(name:String,age:Int){
    println("İsim : $name | Yaş : $age")
}

fun humans(vararg names : String){
    for (name in names){
        println("İsim : $name")
    }
}