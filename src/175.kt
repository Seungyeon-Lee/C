// 175 삼각함수

import kotlin.math.*

fun main(args: Array<String>)
{
    println(sin(PI / 4)) // Double 또는 Float 타입의 라디안 값을 인수로 받는다.
    println(cos(PI / 4)) // 이에 따른 삼각함수 값을 Double 또는 Float 타입으로 반환한다.
    println(tan(PI / 4))

    println(asin(PI / 4))
    println(acos(PI / 4))
    println(atan(PI / 4))

    println(sinh(PI / 4))
    println(cosh(PI / 4))
    println(tanh(PI / 4))

    println(asinh(PI / 4))
    println(acosh(PI / 4)) // NaN (Not a Number)는 값을 계산할 수 없을 때 갖는 값이다.
    println(atanh(PI / 4))
}