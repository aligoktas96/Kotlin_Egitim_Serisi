/**
 * constructor(params) -> primary constructor
 * init{ initialize something }
 * constructor(params) -> secondary constructor
 */
fun main() {
    Identity("Ali","Göktaş","Ankara")
}

class Identity(var name: String, var surName: String) {

    var summary = mutableMapOf<String,String>()
    val a = "asdasd"
    init {

        println("İsim : $name \n Soyisim : $surName")
    }

    constructor(firstName: String, secondName: String, bornCity: String) : this(firstName,secondName){
        summary.put("İsim",firstName)
        summary.put("Soyisim",secondName)
        summary.put("Doğum Yeri",bornCity)
        println("Kimlik bilgileriniz : \t $summary")
    }
}