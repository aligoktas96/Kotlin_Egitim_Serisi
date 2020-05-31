/**
 * OOP - Interface
 *
 * Class : Interface,Interface2  -> Must be override all items
 */
fun main(){
    var littleGirl = Daughter()
    println(littleGirl.eyeColor)
    littleGirl.sayFatherName()
    println("--------")
    println(littleGirl.hairColor)
    littleGirl.sayMotherName()
}

interface Father{
    var eyeColor: String
    fun sayFatherName()
}

interface Mother{
    var hairColor : String
    fun sayMotherName()
}

class Daughter(): Father, Mother{
    override var eyeColor = "blue"
    override fun sayFatherName() {
        println("Emre")
    }

    override var hairColor  = "Black"
    override fun sayMotherName() {
        println("Ayla")
    }
}