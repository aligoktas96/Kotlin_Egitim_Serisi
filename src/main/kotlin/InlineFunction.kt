/**
 * Inline function - Non-inline function
 */
fun main() {
    bloodGroup({ print("A")},{ print("+")})
}

inline fun bloodGroup(first: () -> Unit, second: () -> Unit){
    first()
    print(" RH ")
    second()
}

//----- Non-inline -----
