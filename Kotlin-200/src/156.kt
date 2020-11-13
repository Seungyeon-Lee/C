// 156 문자열 찾아 바꾸기

package ex_string_replace

fun main(args: Array<String>)
{
    val adage = "Love begets love."

    println(adage.replace("love", "hate", ignoreCase = true)) // love를 hate로 교체한다. (대소문자 구분 안함 여부 ignoreCase)
    println(adage.replaceFirst("love", "compliment", ignoreCase = true)) // 첫 번째 love를 compliment로 교체한다.
    println(adage.replaceRange(5 .. 10, "hello")) // 지정한 구간을 hello로 교체한다.
}