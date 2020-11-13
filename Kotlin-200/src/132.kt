// 132 ClosedRange 인터페이스: 닫힌 구간을 표현하는 인터페이스

package ex_closed_range_interface

fun main(args: Array<String>)
{
    val intRange: IntRange = 1 .. 10
    val longRange: LongRange = 1L .. 100L
    val charRange: CharRange = 'A' .. 'Z' // IntRange, LongRange, CharRange는 모두 ClosedRange 인터페이스를 구현하고 있다.

    println(intRange.start) // 첫 번째 값을 출력한다.
    println(longRange.endInclusive) // 마지막 값을 출력한다.
    println('*' in charRange) // '*'은 'A'..'Z' 구간에 포함되어 있지 않으므로 false가 출력된다. (ClosedRange를 리시버로 하는 contains 연산자 확장 함수가 선언되어 있어서 in 연산자를 사용할 수 있다)
    println(charRange.isEmpty()) // 구간은 비어있지 않으므로 false가 출력된다.

    // 실수 타입에 대한 Range 클래스는 원래 존재하지 않았으나 코틀린 1.1 버전부터 ClosedFloatRange, ClosedDoubleRange라는 클래스를 제공하고 있다.
    // 그러나 이들은 IntRange, LongRange, CharRange 클래스와 다르게 for문의 in 연산자에 사용할 수 없는데, iterator 연산자 멤버 함수를 갖고 있지 않기 때문이다.
    // 상식적으로 무한대의 소수점을 갖는 실수 타입에 유한개의 원소를 순회하는 반복자를 구현할 수는 없다.
}