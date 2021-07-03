// 158 Regex 클래스: 정규식 다루기

package ex_regex_class

fun main(args: Array<String>)
{
    val regex = Regex("[0-9]+")
    val str = "4324235"
    val str2 = "324 6546 5432"

    println(regex matches str) // input이 정규식에 매칭되는지 여부를 반환한다.
    println(regex matches str2)
    println(regex.replace(str2, "숫자")) // input 중 정규식에 매칭되는 부분을 숫자로 치환한다.
}