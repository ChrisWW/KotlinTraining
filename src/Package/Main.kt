package Package

import Student2

fun main(args: Array<String>) {

    val student = Student2(null.toString())

    getNameLength(student)

    val obj = Student2("PJATK")

    println(obj.name)

    obj.metodaStudenta()

    var zmienna: String? = "zmiennanienull"


    println("Tutaj cos robie $zmienna")
}

fun getNameLength(student: Student2) {

    println(student.name.count())
}

fun getNameLengthSafe(student: Student2) {

    println(student.name?.count() ?: "0")
}




