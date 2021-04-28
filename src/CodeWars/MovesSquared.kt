package CodeWars

class MovesSquared {


    fun vertMirror(strng: String) = strng.split("\n").map { it.reversed() }.joinToString("\n")

    fun horMirror(strng: String) = strng.split("\n").reversed().joinToString("\n")

    fun oper(f: (String) -> String , s: String): String = f(s)

}