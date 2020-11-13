// 155 String 클래스 살펴보기

package ex_string_class

fun main(args: Array<String>)
{
    val one = "Hello"
    val two = "Kotlin"
    val three = "JavaFx"

    println(one + two) // plus 연산자 멤버함수로 인해 + 연산이 가능하다. (두 문자열이 A B로 합쳐진다)
    println(one > two) // 문자열의 길이가 긴 쪽이 항상 크고, 문자열 길이가 같으면 첫 글자부터 유니코드 순서 기준으로 비교한다.
    println(two > three)
}