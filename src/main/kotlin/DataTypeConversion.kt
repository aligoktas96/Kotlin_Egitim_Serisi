/**
 * --------------------------
 * |    toByte(): Byte       |
 * --------------------------
 * |    toShort(): Short     |
 * --------------------------
 * |    toInt(): Int         |
 * --------------------------
 * |    toLong(): Long       |
 * --------------------------
 * |    toFloat(): Float     |
 * --------------------------
 * |    toDouble(): Double   |
 * --------------------------
 * |    toChar(): Char       |
 * --------------------------
 */

fun main(){
    var shortSample:Short=300

    var convertedValue:Int= shortSample.toInt()

    println(convertedValue::class.simpleName)

    println(convertedValue)

    var floatSample:Float=3.14F

    var convertedFloat:Double=floatSample.toDouble()

    println(convertedFloat::class.simpleName)

    println(convertedFloat)
}