// 151 접두사·접미사 관련 CharSequence 확장 함수

package ex_prefix_suffix

fun main(args: Array<String>)
{
    val str: CharSequence = "https://www.naver.com"

    println(str.startsWith("https://")) // 문자열이 지정한 prefix로 시작하면 true를, 그렇지 않으면 false를 반환한다. (ignoreCase를 true로 지정하면 대소문자를 구분하지 않는다)
    println(str.endsWith(".com")) // 문자열이 지정한 suffix로 끝나면 true를, 그렇지 않으면 false를 반환한다.

    println(str.removePrefix("https://")) // 문자열이 지정한 prefix로 시작하면 그 부분을 잘라낸 문자열을 반환한다.
    println(str.removeSuffix(".com")) // 문자열이 지정한 suffix로 끝나면 그 부분을 잘라낸 문자열을 반환한다.
    println(str.removeSurrounding("https://", ".com")) // 문자열이 지정한 prefix로 시작하고 suffix로 끝나면 그 부분을 잘라낸 문자열을 반환한다.
}