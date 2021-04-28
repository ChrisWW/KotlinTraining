import java.lang.IllegalArgumentException

fun main(args : Array<String>) {
        var name = null

        println(name)

        name ?: "empty"

        println(name)

    }

    fun stringLength(input: String?) = input?.length ?: 0

    fun variableTest(nazwa: String) {

    }

    fun processName(name: String? ): String {

        val processedName = name ?: "empty"

        return processedName
    }

    fun stringLength2(input: String?) = input?.length ?: 0

    fun validateName(name: String?) : String {
        return name?: throw IllegalArgumentException("Name must not be null")
    }


fun regularCastAndSmartCast() {
    val num: Number = 123

    val resultOne: Int = num as Int

    if (num is Int) {
        val resultTwo: Int = num
    }

fun classCastExceptionDemo() {

    val num: Any = 123

    val result: String? = if(num is String) {
        num as String
    } else {
        "empty"
    }
}

    fun safeCastDemo(): String? {

        val num: Any = 123

        val result = num as? String

        return result
    }



}


class Student(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherStudent = other as? Student ?: return false

        return firstName == otherStudent.firstName
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }


}