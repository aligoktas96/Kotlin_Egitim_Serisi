/**
 * Type	  Size (bits)  	   Min value	                    Max value
 * ------------------------------------------------------------------------------------------
 * Byte	      8	            -128	                            127                          |
 * Short     16           	-32768         	                    32767                        |
 * Int	     32	            -2,147,483,648	                    2,147,483,647                |
 * Long	     64	            -9,223,372,036,854,775,808 	        9,223,372,036,854,775,807    |
 *                                                                                           |
 * ------------------------------------------------------------------------------------------                                                                                          |
 * ------------------------------------------------------------------------------------------                                                                                          |
 * Type	   Size (bits)	Significant bits	Exponent bits	Decimal digits                   |
 * ------------------------------------------------------------------------------------------
 * Float	32	              24	            8	            6-7                          |
 * Double	64	              53	            11	            15-16                        |
 * ------------------------------------------------------------------------------------------
 * */


fun main(){

    //Default declare
    var defaultInt = 4000

    var defaultLong = 4422334455667788992

    // Static declare
    var byteSample:Byte = 20


    var shortSample:Short = 5000

    var IntSample:Int = 500000

    var nonDeclared = 300

    // Decimals

    var floatSample:Float=3.1412312312123123f

    var doubleSample:Double=3.14

    println(floatSample)
}