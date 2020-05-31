/**
 *
 *            Comparison and Equality Operators         |   Logical Operators     |
 *   ------------------------------------------------   | ----------------------  |
 *    >	        greater than	            a > b       |      &&    AND          |
 *    <	        less than	                a < b       |      ||    OR           |
 *    >=	    greater than or equals to	a >= b      | ------------------------
 *    <=	    less than or equals to	    a < = b     |
 *    ==	    is equal to	                a == b      |
 *    !=	    not equal to	            a != b      |
 *    --------------------------------------------------
 */
fun main(){
    var firstNumber = 10

    var secondNumber = 10

    var thirdNumber = 30

    var result : Boolean

    result = firstNumber!=secondNumber

    result = firstNumber==secondNumber || thirdNumber==firstNumber

    print(result)


}