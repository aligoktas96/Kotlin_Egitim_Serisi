/**
 * OOP - Overriding
 * class A fun b -> class B fun b
 *
 */
fun main(){
    var newKing = Prince()
    newKing.say()
}

open class King{
    var family = mutableMapOf<String,String>()
    init {
        family.put("King","Philip")
        family.put("Queen","Elizabeth")
    }
    open fun say(){
        println("UK ROYAL FAMILY : $family")
    }
}

class Prince:King(){
    override fun say(){
        family.replace("King","Philip","Charles")
        family.replace("Queen","Elizabeth","Diana")
        println("NEW UK ROYAL FAMILY : $family")
    }
}

