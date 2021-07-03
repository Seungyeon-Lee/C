// 074 Nothing 타입

import java.lang.Exception

fun throwing(): Nothing = throw Exception() // throw 표현식도 표현식으로 취급한다. Nothing 타입은 어떤 타입과도 호환된다.

fun main(args: Array<String>)
{
    println("start")
    val i: Int = throwing()
    println(i)
}

fun validate(num: Int)
{
    val result: Int =
            if(num >= 0) num
            else throw Exception("num이 음수입니다.") // Nothing 타입은 throw를 표현식으로 쓸 수 있게 하기 위한 장치이다.
            // 예외 표현식이 Unit 타입이었다면 if-else는 Int-Unit으로 타이비 호환되지 않아서 사용이 불가능하다.
}