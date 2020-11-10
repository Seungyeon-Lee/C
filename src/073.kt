// 073 예외 던지기

import java.lang.Exception

fun main(args: Array<String>)
{
    try
    {
        something()
    }
    catch(e: Exception)
    {
        println(e.message)
    }
}

fun something()
{
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b: Int): Int
{
    if(b == 0)
        throw Exception("0으로 나눌 수 없습니다.") // throw Throwable 타입 표현식 (예외를 던지는 코드)
    return a / b
}