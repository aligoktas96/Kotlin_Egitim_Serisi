/**
 * OOP - Data Class
 *
 *  hashCode() , toString() , equals() , copy()
 */

fun main() {
    var arthur = Student(1.60F,70,footNumber = 39)
    var modifiedArthur = Dietitian(arthur)
    println(modifiedArthur.checkChildStatus())

    var hans = arthur.copy(1.59F)
    var modifiedHans = Dietitian(hans)
    println(modifiedHans.checkChildStatus())

    println(hans.hashCode().equals(arthur.hashCode()))

    var (height,weight,footNumber) = arthur


}

data class Student(var height: Float, var weight: Int, var footNumber: Int) {
    lateinit var status: Status
}


class Dietitian(var child: Student) {
    fun checkChildStatus(): Status {
        if (child.height < 1.70F && child.weight > 60) {
            child.status = Status.FAT
        } else if (child.height in 1.70F..1.90F && child.weight in 70..90){
            child.status = Status.NORMAL
        }
        else if (child.height < 1.70F && child.weight < 60){
            child.status = Status.THIN
        }
        else{
            child.status = Status.PROCESSING
        }
        return child.status
    }
}


enum class Status {
    FAT, NORMAL, THIN,PROCESSING
}