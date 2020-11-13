// 169 실수 값 올림·내림·반올림하기

package ex_round_functions

import kotlin.math.*

fun main(args: Array<String>)
{
    print("${ceil(3.2)} ") // 실수 값을 올림하는 함수
    print("${ceil(3.7)} ")
    print("${floor(3.2)} ") // 실수 값을 내림하는 함수
    print("${floor(3.7)} ")
    print("${round(3.2)} ") // 실수 값을 반올림하는 함수
    print("${round(3.7)} ")
    print("${15.83.roundToInt()} ") // 실수 값을 Int 타입으로 반올림하는 확장 함수
    print("${37842.45.roundToLong()}") // 실수 값을 Long 타입으로 반올림하는 확장 함수
}