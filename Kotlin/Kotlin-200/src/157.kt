// 157 StringBuilder 클래스 : 문자열 덧붙이기

package ex_string_builder_class

import java.lang.StringBuilder

fun main(args: Array<String>)
{
    val builder = StringBuilder()
            .append("2018 ")
            .append("Pyeongchang ")
            .append("Olympic") // append 멤버 함수는 StringBuilder 자기 자신을 반환하기 때문에 연쇄적으로 호출이 가능하다.

    val result = builder.toString()
    println(result)
}