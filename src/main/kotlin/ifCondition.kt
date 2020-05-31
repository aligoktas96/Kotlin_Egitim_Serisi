/**
 *
 * if & else -> condition -> codes
 *
 */
fun main(){
    var min: Int

    print("Birinci değeriniz nedir? :")
    var input1 = readLine()!!.toInt()

    print("İkinci değeriniz nedir? :")
    var input2 = readLine()!!.toInt()

    if (input1>input2)
    {
        min = input2
    }
    else if (input1<input2)
    {
        if (input1>0){
            min = input1
        }
        else{
            min = input1
            print("$min bir negatif sayıdır")
        }
        
    }
    else{
        min=0
        print("Minimum $min'a eşitlendi")
    }

    print("Minimum değeriniz : $min " )
}