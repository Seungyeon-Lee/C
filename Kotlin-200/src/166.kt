// 166 BigInteger 클래스: 매우 큰 정수 보관하기

package ex_big_integer_class

fun main(args: Array<String>)
{
    val a = 78423343543.toBigInteger() // BigInteger는 자바의 클래스이므로 사용 시에 JVM에 의존성이 생긴다.
    val b = 25372465331.toBigInteger() // 자바의 클래스이므로 연산자 오버로딩은 지원하지 않지만 확장 함수로 plus와 minus, timems, div, rem ... 등을 지원한다.

    println(a * b) // Long의 표현 범위를 넘는 값도 출력이 된다.
    println(a + b * 936273.toBigInteger())
}