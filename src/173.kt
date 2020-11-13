// 173 지수함수

import kotlin.math.*

fun main(args: Array<String>)
{
    println(sqrt(2.0)) // square root(제곱근)을 반환한다.
    println(2.0.pow(0.5)) // 리시버에 x 제곱을 반환하는 확장 함수이다. (infix 선언이 없으므로 pow 확장 함수를 연산자처럼 쓰는 것은 불가능하다)
    println(exp(2.0)) // 자연상수의 x 제곱 값을 반환한다.
    println(expm1(2.0)) // 자연상수의 x 제곱 - 1 값을 반환한다.
}