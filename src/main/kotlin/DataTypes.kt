/**
 *
 * Veri Tipleri ve Değişkenler
 *
 * Mutable -> Sonradan değiştirilebilen değişkenler
 * Immutable -> Sonradan değiştirilemeyen değişkenler
 *
 * Int,String,Boolean,Char
 *
 * Double,Float,Long,Short
 *
 */

fun main(){

    var yas:Int=20

    val kilo:Int=65

    yas=25

    println(yas)

    //-----------

    var isim:String="ali"

    var basHarf:Char='a'

    //----------------

    var degisken:Boolean=true
    var degisken2:Boolean=false

    println(degisken)
    println(degisken2)


    var fl:Float=3.555f
    println("${fl::class.simpleName}")

}