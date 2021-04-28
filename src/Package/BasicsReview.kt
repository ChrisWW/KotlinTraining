package Package

fun main() {

    wave("Hello")
}

fun wave(str: String) : List<String>{
    val res = arrayListOf<String>()

    for (i in str.indices) {
        if (str[i].isLetter()) {
            val s = str.toLowerCase().toCharArray().toMutableList()

            s[i] = str[i].toUpperCase()
            res.add(s.joinToString(""))

        }
    }

    return res
}