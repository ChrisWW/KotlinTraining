
fun main(args: Array<String>) {

    val data: String? = "Important Data"

    // processData(data)

    if (data != null)
        processData(data)

    data?.let { processData(it) }

    val moreData: String? = null

    moreData?.let { processData(it) }
}



class Student2(val name: String) {

    fun metodaStudenta() {
        println("Jestem studentem $name")
    }
}

class SomeActivity {

    private var student: Student2? = null

    fun onCreate() {
        student = Student2("Mike")
    }

    fun onResume() {
        val nameOne = student!!.name

        val nameTwo = student?.name
    }
}

class AnotherActivity {
     private lateinit var student: Student2

    fun onCreate() {

        student = Student2("Mike")
    }
    fun onResume() {
        val name = student.name
    }
}




fun processData(data: String) {
    println("Processing $data")
}


