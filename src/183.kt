// 183 exitProcess 함수: 어디서나 프로그램 종료하기

import kotlin.system.exitProcess // 다른 내장함수와 다르게 kotlin.system에 선언된 함수는 반드시 import 해주어야 한다.

fun main(args: Array<String>)
{
    something(-1)
    println("Hello")
}

fun something(num: Int)
{
    if(num < 0)
        exitProcess(0) // 실행 흐름이 어디에 있든 프로그램을 바로 종료시킬 수 있다.
}