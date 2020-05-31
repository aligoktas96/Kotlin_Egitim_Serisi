/**
 * Effective conditions
 */
fun main(){

    print("Birinci değeriniz nedir? :")
    var input1 = readLine()!!.toInt()

    print("İkinci değeriniz nedir? :")
    var input2 = readLine()!!.toInt()

    val min = if(input1>input2) input2 else if (input2>input1) input1 else 0

    //print("Minimum değeriniz : $min")

    //--------------------------------------------------

    val min2 = if (input1>input2){
        print("ilk bloğa girdiniz")
        input2
    }
    else if (input2>input1){
        print("ikinci bloğa girdiniz")
        input1
    } else
    {
        print("Değeriniz 0'a eşitlendi")
        0
    }
}