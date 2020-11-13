// Any?.toString 확장 함수

fun main(args: Array<String>)
{
    val empty: Int? = null
    val str: String = empty.toString()
    println(str) // null 값에 toString을 호출하더라도 Any?.toString(): String = this?.toString() ?: "null"로 인해 안전하게 출력된다.
}