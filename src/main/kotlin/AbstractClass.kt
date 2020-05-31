/**
 * OOP - Abstract Class - Methods - properties
 *
 */
fun main() {
    var book = Book345()
    book.sayBookName()
    println(book.pageSize)
}

abstract class Library{
    abstract var pageSize : Int
    var bookType : String ?=null
    abstract fun sayBookName()
}

class Book345: Library(){
    override var pageSize = 123
    override fun sayBookName() {
        println("Book345")
    }
}