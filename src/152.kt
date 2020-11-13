// 152 비어 있는 CharSequence인지 검사하기

package ex_char_sequence_empty

fun main(args: Array<String>)
{
    val emptyStr = ""
    val whiteSpaces = " "
    val nullStr: String? = null

    println(emptyStr.isEmpty()) // isEmpty는 문자열이 비어 있는지, 즉 ""와 같은지 여부를 반환하는 확장 함수이다. (반대인 isNotEmpty도 존재한다)
    println(whiteSpaces.isEmpty())

    println(emptyStr.isBlank()) // isBlank는 문자열이 비어 있거나 공백 문자로 이루어져 있는지 여부를 반환하는 확장 함수이다.
    println(whiteSpaces.isBlank())

    println(nullStr.isNullOrEmpty()) // isNullorEmpty는 문자열이 null이거나 비어있는 지 여부를 반환하는 확장 함수이다.
    println(nullStr.isNullOrBlank()) // isNullorBlacnk는 문자열이 null이거나 공백 문자로 이루어져 있는지 여부를 반환하는 확장 함수이다.
}