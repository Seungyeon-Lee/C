// 153 CharSequence 가공하기

package ex_trim_char_sequence

fun main(args: Array<String>)
{
    val str = " hello "

    println(str.removeRange(0 .. 5)) // 지정한 범위의 문자들을 제거한 문자열을 반환한다.

    println(str.padStart(20, '*')) // 문자열 길이를 length만큼 늘인 뒤, 앞 부분의 빈 공간을 padChar로 채운 문자열을 반환한다.
    println(str.padEnd(17, '*')) // 문자열 길이를 length만큼 늘인 뒤, 뒷 부분의 빈 공간을 padChar로 채운 문자열을 반환한다.

    println(str.trimStart()) // 문자열 앞 부분의 공백문자를 없앤 문자열을 반환한다.
    println(str.trimEnd()) // 문자열 뒷 부분의 공백문자를 없앤 문자열을 반환한다.
    println(str.trim()) // 문자열 앞 뒤의 공백문자를 없앤 문자열을 반환한다.

    println(str.slice(4 .. 6)) // 지정한 범위의 문자열을 잘라낸 뒤 반환한다.
    println(str.subSequence(4 .. 6))
    println(str.substring(4 .. 6))

    println(str.reversed()) // 문자열을 거꾸로 뒤집은 문자열을 반환한다.
}