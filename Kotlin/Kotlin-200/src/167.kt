// 167 BigDecimal 클래스: 매우 작은 실수 보관하기

package ex_big_decimal_class

fun main(args: Array<String>)
{
    val a = 3.0000000000003.toBigDecimal() // Double의 표현 범위를 넘는 실수를 다룰 때 사용하는 클래스이다. (자바 표준 라이브러리 선언이므로 사용 시 JVM에 의존성을 가짐)
    val b = 4.0000000000004.toBigDecimal()
    println(a * b) // 코틀린 표준 라이브러리에서 연산자 확장 함수를 제공하기 때문에 Double 타입을 다루듯이 사용할 수 있다.
}