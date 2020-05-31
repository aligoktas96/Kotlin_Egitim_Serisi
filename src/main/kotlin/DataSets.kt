/**
 * Mutable Collections |  Immutable Collections |
 * ------------------- | -----------------------|
 *   mutableMapOf()    |         SetOf()        |
 *   mutableListOf()   |         MapOf()        |
 *   mutableSetOf()    |         ListOf()       |
 *   ArrayListOf()     |                        |
 * ---------------------------------------------
 */


fun main() {
    var sampleList = mutableListOf<Any>(1, 3, 5, 7, 9, "ali", 'c', true)

    sampleList.removeAt(0)

    //print(sampleList.get(0))

    //-------------

    var arraySample = Array<Any>(5) { 0 }

    //arraySample.set(7,"ali")

    //print(arraySample.get(7))

    //-------------

    var arrayOfSample = arrayListOf<Any>(1,2,2,3,3,3,3,3,"ali",true)


    println(arrayOfSample)

    //-----------

    var students = mutableMapOf<String,Int>("ali göktaş" to 1, "ayşe can" to 3 , "cemre gül" to 2)
    students.put("ahmet can",4)

    print(students.get("ahmet can"))

    //------------

    var setSample = setOf<Any>(1,2,3,3,2,3,2)

    print(setSample)






}