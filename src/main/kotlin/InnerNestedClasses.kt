/**
 * OOP - Inner Class  &  Nested Class
 *
 * Outer.Nested().someFunc()
 *
 * Outer().Inner().someFunc()
 */

fun main() {
    Publisher().Book1().printPublisher()
    Publisher.Book2().printPublisher()
}


open class Author(){
    var author1 = "Ali Göktaş"
    var author2 = "Ayşe Fatma"
}

class Publisher(){
    var publisherName = "asd Yayıncılık"
    inner class Book1:Author(){
        fun printPublisher(){
            println(publisherName)
            println("Yazar : $author1")
        }
    }

    class Book2:Author(){
        var publisherName = "dsa yayıncılık"
        fun printPublisher(){
            println(publisherName)
        }
    }
}