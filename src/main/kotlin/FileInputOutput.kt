import java.io.File

/**
 * File I/O
 *
 * File(filepath).writeText()
 *
 * File(filepath).readText()
 *
 */

fun main(){
    var filePath = "./src/main/kotlin/output.txt"
    var process = FileProcess()

    process.showText(filePath)
    process.readText(filePath)
}

class FileProcess(){
    lateinit var text :String
    fun showText(filePath : String){
        try {
            print(text)
        }
        catch (e:UninitializedPropertyAccessException){
            print("Hata aldınız. Lütfen output.txt dosyasından detayları inceleyiniz")
            var err = e.stackTrace.get(0)
            var errStack = """
                Developer : Ali Göktaş
                -----------------------
                ${err.fileName}
                ${err.className}
                ${err.methodName}
                ${err.lineNumber}
                ${e.message}
            """.trimIndent()
            File(filePath).writeText(errStack)
        }
    }

    fun readText(filePath:String){
        print(File(filePath).readText())
    }
}